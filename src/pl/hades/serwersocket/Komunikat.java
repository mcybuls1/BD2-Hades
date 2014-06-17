package pl.hades.serwersocket;

import java.io.Serializable;

/**
 * Pomocnicza klasa do pobierania danych od klientów.
 *
 * @author Michał Żurawski
 */
class Komunikat implements Serializable
{
    private static final long serialVersionUID = 1L;
    private final Integer id;
    private final Object komunikat;

    Komunikat(final Integer id, final Object komunikat)
    {
        this.id = id;
        this.komunikat = komunikat;
    }

    Integer getId()
    {
        return id;
    }

    Object getKomunikat()
    {
        return komunikat;
    }
}
