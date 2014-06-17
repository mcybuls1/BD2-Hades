package pl.hades.klientsocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import pl.hades.serwersocket.BladPolaczeniaException;

/**
 * Klasa odpowiedzialna za ustanowienie połączenia, od strony klienta.
 * Wykorzystuje kolejki, w celu przechowywania wiadomości.
 *
 * @author Michał Żurawski
 */
public class KlientSocket
{
    /** Socket tworzący połączenie z serwerem. */
    private Socket socket;
    /** Kolejka z wiadomościami od serwera. */
    private final BlockingQueue<Object> kolejka = new LinkedBlockingQueue<>();
    /** Port, pod którym nawiązywane jest połączenie. */
    private final int port;
    /** Adres hosta, pod którym nawiązywane jest połączenie. */
    private final String host;
    /** Informacja, czy klient jest podłączony. */
    private boolean uruchomiony = false;
    /** Odbieranie komunikatów od serwera. */
    private ObjectInputStream in;
    /** Wysyłanie komunikatów do serwera. */
    private ObjectOutputStream out;

    /**
     * Utworzenie nowego klienta pod danym adresem, na danym porcie, bez
     * uruchamiania.
     *
     * @param port Port, pod którym nawiązywane jest połączenie.
     * @param host Adres hosta, pod którym nawiązywane jest połączenie.
     */
    public KlientSocket(int port, final String host)
    {
        this.port = port;
        this.host = host;
    }

    /**
     * Zatrzymuje pracę klienta.
     *
     * @throws BladPolaczeniaException wyrzucany w przypadku problemów z
     * zakończeniem.
     *
     */
    public void stop() throws BladPolaczeniaException
    {
        uruchomiony = false;
        try
        {
            if (out != null)
            {
                out.close();
                out = null;
            }
            if (in != null)
            {
                in.close();
                in = null;
            }
            if (socket != null)
            {
                socket.close();
                socket = null;
            }
        }
        catch (IOException e)
        {
            throw new BladPolaczeniaException();
        }
        kolejka.clear();
    }

    /**
     * Rozpoczyna nasłuch komunikatów od serwera.
     *
     * @throws BladPolaczeniaException wyrzucany w przypadku problemów z
     * rozpoczęciem.
     *
     */
    public void start() throws BladPolaczeniaException
    {
        try
        {
            socket = new Socket(host, port);
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());
        }
        catch (IOException e)
        {
            throw new BladPolaczeniaException();
        }
        uruchomiony = true;
        new WatekOdbierania().start();
    }

    /**
     * Odbiera element wysłany przez serwer z kolejki.
     *
     * @return Obiekt wyciągnięty z kolejki
     * @throws BladPolaczeniaException wyrzucany w przypadku problemów z
     * odczytem z kolejki.
     */
    public Object odbierz() throws BladPolaczeniaException
    {
        try
        {
            return kolejka.take();
        }
        catch (InterruptedException e)
        {
            throw new BladPolaczeniaException();
        }
    }

    /**
     * Wysyła wiadomość do serwera.
     *
     * @param komunikat Komunikat, który zostanie przekazany serwerowi.
     * @throws BladPolaczeniaException wyrzucany w przypadku problemów z
     * połączeniem.
     */
    public void wyslij(final Object komunikat) throws BladPolaczeniaException
    {
        try
        {
            if (out == null)
            {
                System.out.println("null");
                throw new BladPolaczeniaException();
            }
            out.writeObject(komunikat);
        }
        catch (IOException e)
        {
            System.out.println("IOE");
            throw new BladPolaczeniaException();
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
                    kolejka.add(wiadomosc);
                }
                catch (IOException | ClassNotFoundException ex)
                {
                    try
                    {
                        KlientSocket.this.stop();
                    }
                    catch (BladPolaczeniaException e)
                    {
                        /** Nic się nie da zrobić. */
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}

