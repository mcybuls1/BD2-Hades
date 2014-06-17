package pl.hades.serwersocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Klasa odpowiedzialna za ustanowienie połączenia, ze strony serwera, z
 * wykorzystaniem kolejki, w celu przechowywania wiadomości. SerwerSocket przechowuje
 * listę klientów aktualnie podłączonych, identyfikowanych kolejnymi liczbami
 * całkowitymi, poczynając od 1.
 *
 * @author Michał Żurawski
 */
public class SerwerSocket
{
    /** ID unikalny dla każdego połączenia. */
    private int unikalnyID = 1;
    /** Kontener przechowujący wszystkich klientów. */
    private final Map<Integer, WatekKlienta> listaKlientow = new HashMap<>();
    /** Kolejka z wiadomościami od klientów. */
    private final BlockingQueue<Komunikat> kolejka = new LinkedBlockingQueue<>();
    /** Socket akceptujący nowych klientów. */
    private ServerSocket socket;
    /** Port, pod którym będzie ustalane połączenie. */
    private final int port;
    /** Informacja, czy serwer jest uruchomiony. */
    private boolean uruchomiony = false;
    /** Kontroler, z którym komunikuje się klasa. */
    private final Odbieralny kontroler;

    /**
     * Tworzy nowy serwer, pod danym portem, ale nie uruchamia go.
     *
     * @param port Port, na którym zostanie uruchomiony serwer.
     * @param kontroler Klasa, do której zostaną przekazywane komunikaty.
     */
    public SerwerSocket(int port, final Odbieralny kontroler)
    {
        this.port = port;
        this.kontroler = kontroler;
    }

    /**
     * Zatrzymuje pracę serwera.
     *
     * @throws BladPolaczeniaException
     */
    public void stop() throws BladPolaczeniaException
    {
        uruchomiony = false;
        kolejka.clear();
        if (socket == null)
        {
            return;
        }
        try
        {
            socket.close();
        }
        catch (IOException e)
        {
            throw new BladPolaczeniaException();
        }
        socket = null;
        for (WatekKlienta wk : listaKlientow.values())
        {
            if (wk != null)
            {
                wk.stop();
            }
        }
    }

    /**
     * Rozpoczyna nasłuch komunikatów od klientów. Tworzy wątki odpowiedzalne za
     * odbiór komunikatów z kolejki oraz akceptowanie nowych połączeń.
     *
     * @throws BladPolaczeniaException
     *
     */
    public void start() throws BladPolaczeniaException
    {
        try
        {
            socket = new ServerSocket(port);
        }
        catch (IOException e1)
        {
            throw new BladPolaczeniaException();
        }
        uruchomiony = true;
        new Thread()
        { // odbieranie komunikatów z kolejki
            @Override
            public void run()
            {
                while (true)
                {
                    try
                    {
                        final Komunikat komunikat = kolejka.take();
                        kontroler.odbierz(komunikat.getId(), komunikat.getKomunikat());
                    }
                    catch (InterruptedException ex)
                    {
                        /** Nie powinno się pojawić. */
                        throw new RuntimeException(ex);
                    }
                }
            }
        }.start();
        new Thread()
        { // akceptowanie połączeń
            @Override
            public void run()
            {
                try
                {
                    while (uruchomiony)
                    {
                        new WatekKlienta(new Integer(unikalnyID), socket.accept()).start();
                        ++unikalnyID;
                    }
                }
                catch (IOException e)
                {
                    /** Nie powinno się pojawić. */
                    throw new RuntimeException(e);
                }
            }
        }.start();
    }

    /**
     * Wysyła komunikat wszystkim połączonym klientom. W przypadku niepowodzenia
     * usuwa klienta oraz powiadamia o tym kontroler.
     *
     * @param komunikat Komunikat, który zostanie przekazany klientom.
     */
    public void wyslijWszystkim(final Object komunikat)
    {
        synchronized (listaKlientow)
        {
            for (Integer id : listaKlientow.keySet())
            {
                wyslijWybranemu(id, komunikat);
            }
        }
    }

    /**
     * Wysyła komunikat wybranemu klientowi. W przypadku niepowodzenia usuwa
     * klienta oraz powiadamia o tym kontroler.
     *
     * @param id Id danego klienta.
     * @param dane Dane, które zostaną przekazane klientowi.
     */
    public void wyslijWybranemu(final Integer id, final Object dane)
    {
        boolean zakonczone = false;
        synchronized (listaKlientow)
        {
            final WatekKlienta wk = listaKlientow.get(id);
            if (wk != null)
            {
                wk.wyslij(dane);
            }
            else
            {
                kolejka.add(new Komunikat(id, null));
                zakonczone = true;
            }
        }
        if (zakonczone)
        {
            zakonczPolaczenie(id);
        }
    }

    /**
     * Nakazuje serwerowi usunęcie wybranego klienta.
     *
     * @param klientId Numer klienta do usunięcia.
     */
    public void zakonczPolaczenie(final Integer klientId)
    {
        synchronized (listaKlientow)
        {
            if (listaKlientow.containsKey(klientId))
            {
                final WatekKlienta wk = listaKlientow.get(klientId);
                kolejka.add(new Komunikat(klientId, null));
                if (wk != null)
                {
                    wk.stop();
                }
                listaKlientow.remove(klientId);
            }
        }
    }

    /**
     * Oczyszcza bufor wszystkim klientom. W przypadku niepowodzenia usuwa
     * klienta oraz powiadamia o tym kontroler.
     */
    public void reset()
    {
        final Collection<Integer> zakonczone = new LinkedList<>();
        synchronized (listaKlientow)
        {
            for (Integer id : listaKlientow.keySet())
            {
                final WatekKlienta wk = listaKlientow.get(id);
                if (wk != null)
                {
                    wk.reset();
                }
                else
                {
                    zakonczone.add(id);
                    kolejka.add(new Komunikat(id, null));
                }
            }
        }
        for (Integer id : zakonczone)
        {
            zakonczPolaczenie(id);
        }
    }

    /**
     * Dodaje nowy wątek klienta, do listy klientów.
     *
     * @param watek Dodawany klient.
     */
    private void akceptujPolaczenie(final WatekKlienta watek)
    {
        final Integer id = watek.id;
        synchronized (listaKlientow)
        {
            listaKlientow.put(id, watek);
        }
    }

    /**
     * Klasa przechowująca informacje o identyfikatorze klienta, odbierająca
     * dane wysyłane przez danego klienta i zapisująca je w kolejce, oraz
     * wysyłająca do niego dane.
     */
    private class WatekKlienta
    {
        /** Unikalny id, danego klienta. */
        final Integer id;
        /** Połączenie danego klienta. */
        Socket polaczenie;
        /** Odczytywanie danych z sieci. */
        ObjectInputStream in;
        /** Zapisywanie danych do kolejki. */
        ObjectOutputStream out;
        /** Przechwytywanie danych z sieci. */
        Thread watekOdbierania;
        /** Stan połączenia danego wątku. */
        boolean uruchomiony = false;

        /**
         * Tworzy nowego klienta, nie uruchamiając nasłuchiwania.
         *
         * @param id Numer wybranego klienta.
         * @param polaczenie Połączenie, z danym klientem.
         */
        private WatekKlienta(final Integer id, final Socket polaczenie)
        {
            this.id = id;
            this.polaczenie = polaczenie;
        }

        /**
         * Zamyka połączenie danego klienta.
         */
        private void stop()
        {
            try
            {
                uruchomiony = false;
                polaczenie.close();
            }
            catch (IOException ex)
            {
                /** Można zignorować. */
            }
        }

        /**
         * Funkcja rozpoczynająca nasłuch danych z serwera.
         */
        private void start()
        {
            if (polaczenie != null && !polaczenie.isClosed())
            {
                try
                {
                    out = new ObjectOutputStream(polaczenie.getOutputStream());
                    out.flush();
                    in = new ObjectInputStream(polaczenie.getInputStream());
                    uruchomiony = true;
                    akceptujPolaczenie(WatekKlienta.this);
                    watekOdbierania = new WatekOdbierania();
                    watekOdbierania.start();
                }
                catch (IOException ex)
                {
                    zakonczPolaczenie(id);
                }

            }
        }

        /**
         * Wysyła wiadomość danemu klientowi.
         *
         * @param komunikat Komunikat, który zostanie przekazany klientowi.
         */
        private void wyslij(Object komunikat)
        {
            try
            {
                out.writeObject(komunikat);
            }
            catch (IOException e)
            {
                zakonczPolaczenie(id);
            }
        }

        /**
         * Oczyszcza bufor.
         */
        private void reset()
        {
            try
            {
                out.reset();
            }
            catch (IOException e)
            {
                zakonczPolaczenie(id);
            }
        }

        /**
         * Klasa nasłuchująca komunikatów od kliena.
         */
        private class WatekOdbierania extends Thread
        {
            @Override
            public void run()
            {
                while (uruchomiony)
                {
                    try
                    {
                        final Object wiadomosc = in.readObject();
                        final Komunikat komunikat = new Komunikat(id, wiadomosc);
                        kolejka.add(komunikat);
                    }
                    catch (IOException | ClassNotFoundException ex)
                    {
                        zakonczPolaczenie(id);
                    }

                }
            }
        }
    }
}
