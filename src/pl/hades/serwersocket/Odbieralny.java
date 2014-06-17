package pl.hades.serwersocket;

/**
 * Interferjs umożliwiający odbieranie obiektów.
 *
 * @author Michał Żurawski
 */
public interface Odbieralny
{
    /**
     * Funkcja odbierająca komunikat od serwera.
     *
     * @param id Identyfikator klienta.
     * @param komunikat Treść komunikatu.
     */
    void odbierz(final Integer id, final Object komunikat);
}
