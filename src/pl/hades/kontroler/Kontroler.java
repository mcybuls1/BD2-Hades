package pl.hades.kontroler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pl.hades.baza.Firma;
import pl.hades.baza.Miejsce;
import pl.hades.baza.Zlecenie;
import pl.hades.model.Model;
import pl.hades.serwersocket.Odbieralny;
import pl.hades.serwersocket.SerwerSocket;

/**
 * Klasa odpowiedzialna za przesyłanie komunikatów pomiędzy modelem, a widokiem.
 *
 * @author Michał Żurawski
 */
public class Kontroler implements Odbieralny
{
    /** Model, z którym komunikuje się kontroler. */
    private final Model model;
    /** Serwer, z którym komunikuje się kontroler. */
    private SerwerSocket serwer;
    /** Mapa przechowująca działanie, dla określonego typu. */
    private final Map<TypKomunikatu, Dzialanie> dzialania = new HashMap<>();

    /**
     * Tworzy kontroler oraz inicjalizuje działania.
     *
     * @param model Model, z którym komunikuje się kontroler.
     */
    public Kontroler(final Model model)
    {
        this.model = model;
        inicjalizujDzialania();
    }

    /**
     * Ustawia serwer, do którego będą wysyłane wiadomości.
     *
     * @param serwer Serwer, do którego będą wysyłane wiadomości.
     */
    public void setSerwer(final SerwerSocket serwer)
    {
        this.serwer = serwer;
    }

    @Override
    public void odbierz(final Integer id, final Object wiadomosc)
    {
        if (wiadomosc == null || !(wiadomosc instanceof Wiadomosc))
        {
            return;
        }
        final Wiadomosc wiadomoscc = (Wiadomosc) wiadomosc;
        final TypKomunikatu typ = wiadomoscc.getTyp();
        final Serializable dane = wiadomoscc.getDane();
        if (dzialania.containsKey(typ))
        {
            dzialania.get(typ).wykonaj(id, dane);
        }
    }

    /**
     * Inicjalizacja odbieranych działań.
     */
    private void inicjalizujDzialania()
    {
        dzialania.put(TypKomunikatu.ZLECENIE, new Dzialanie() 
        {

            @Override
            public void wykonaj(Integer klient, Serializable zadanie)
            {
                final ArrayList<Zlecenie> zlecenia = model.pobierzZlecenia();
                serwer.wyslijWybranemu(klient, new Wiadomosc(TypKomunikatu.ZLECENIE, zlecenia));
                final ArrayList<Firma> firmy = model.pobierzFirmy();
                serwer.wyslijWybranemu(klient, new Wiadomosc(TypKomunikatu.FIRMA, firmy));
            }
        });
    }

    /**
     * Działanie podjęte przez danego klienta, na wybranym stole.
     */
    private interface Dzialanie
    {
        /**
         * Prośba do modelu o wykonanie przez danego klienta działania na
         * wybranym stole.
         *
         * @param klient Numer klienta który chce wykonać operację.
         * @param stol Numer stołu, na którym ma być wykonana operacja.
         * @param zadanie Zadanie, które ma być wykonane.
         */
        void wykonaj(final Integer klient, final Serializable zadanie);
    }
}
