package pl.hades.widok;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import pl.hades.klientsocket.KlientSocket;
import pl.hades.klientsocket.Odbieralny;
import pl.hades.kontroler.TypKomunikatu;
import pl.hades.kontroler.Wiadomosc;
import pl.hades.serwersocket.BladPolaczeniaException;

/**
 * Klasa tworząca widok, do komunikacji pomiędzy modelem, a interfejsem
 * graficznym klienta.
 *
 * @author Michał Żurawski
 */
public class Widok implements Odbieralny
{
    /** Informacja o błędzie z połączeniem. */
    private static final String BLAD_POLACZENIA = "Błąd połączenia z serwerem. Proszę spróbować ponownie.";
    /** Referencja do klienta, z którą komunikuje się widok. */
    private final KlientSocket klient;
    /** Okno wyświetlające dane. */
    private final View view = new View();
    /** Działania podejmowane po otrzymaniu wybranego komunikatu. */
    private final Map<TypKomunikatu, Dzialanie> dzialania = new HashMap<>();

    public Widok(final KlientSocket klient)
    {
        this.klient = klient;
    }

    /**
     * Wyświetla okno menu głównego i inicjalizuje odbiór.
     */
    public void wyswietl()
    {
        final Thread odbior = new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    try
                    {
                        odbierz(klient.odbierz());
                    }
                    catch (BladPolaczeniaException e)
                    {
                        wyswietlBlad(BLAD_POLACZENIA);
                        zakoncz();
                    }
                }
            }
        };
        odbior.setDaemon(true);
        odbior.start();
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                view.setVisible(true);
            }
        });
    }

    @Override
    public void odbierz(Object komunikat)
    {
        if (!(komunikat instanceof Wiadomosc))
        {
            return;
        }
        final Wiadomosc wiadomosc = (Wiadomosc) komunikat;
        final TypKomunikatu typ = wiadomosc.getTyp();
        final Serializable dane = wiadomosc.getDane();
        if (dzialania.containsKey(typ))
        {
            dzialania.get(typ).wykonaj(dane);
        }
    }
    
    /**
     * Wysyła wiadomość zadanego typu do serwera.
     *
     * @param typ Typ komunikatu, który zostanie przesłany.
     * @param obiekt Obiekt, który zostanie przekazany.
     */
    private void wyslijKomunikat(final TypKomunikatu typ, final Serializable obiekt)
    {
        try
        {
            klient.wyslij(new Wiadomosc(typ, obiekt));
        }
        catch (BladPolaczeniaException e)
        {
            wyswietlBlad(BLAD_POLACZENIA);
            zakoncz();
        }
    }
    
    /**
     * Wyświetla okienko informujące o błędzie.
     *
     * @param blad Tekst, który zostanie wyświetlony w oknie.
     */
    private static void wyswietlBlad(final String blad)
    {
        JOptionPane.showMessageDialog(null, blad, "Błąd",
                JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Kończy działanie widoku.
     */
    private void zakoncz()
    {
        if (view != null)
        {
            javax.swing.SwingUtilities.invokeLater(new Runnable()
            {
                @Override
                public void run()
                {
                    view.dispose();
                }
            });
        }
        if (klient != null)
        {
            try
            {
                klient.stop();
            }
            catch (BladPolaczeniaException e)
            {
                /** Można zignorować. */
            }
        }
    }
    
    /**
     * Inicjalizacja odbieranych działań.
     */
    private void inicjalizujDzialania()
    {
        
    }
    
    /**
     * Działanie podjęte przez klienta.
     */
    private interface Dzialanie
    {
        /**
         * Wykonuje dane zadanie.
         *
         * @param obiekt Obiekt z danymi.
         */
        void wykonaj(final Serializable obiekt);
    }
}
