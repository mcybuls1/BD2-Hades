package pl.hades.kontroler;

import java.io.Serializable;

/**
 * Klasa służąca do przekazywanie danych. Rodzaj danych jest rozpoznawany przez
 * typ komunikatu.
 *
 * @author Michał Żurawski
 */
public class Wiadomosc implements Serializable
{
    private static final long serialVersionUID = 1L;
    /** Typ wiadomości do przekazania. */
    private final TypKomunikatu typ;
    /** Dane, które mają być przekazane. */
    private final Serializable dane;

    /**
     * Tworzy nową wiadomość.
     *
     * @param typ Typ wiadomości do przekazania.
     * @param dane Dane, które mają być przekazane.
     */
    public Wiadomosc(final TypKomunikatu typ, final Serializable dane)
    {
        this.typ = typ;
        this.dane = dane;
    }

    /**
     * Zwraca typ wiadomości.
     *
     * @return Typ wiadomości do przekazania.
     */
    public TypKomunikatu getTyp()
    {
        return typ;
    }

    /**
     * Zwraca przekazane dane.
     *
     * @return Przekazane dane.
     */
    public Serializable getDane()
    {
        return dane;
    }
}
