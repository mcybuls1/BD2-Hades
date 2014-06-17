package pl.hades.klientsocket;

/**
 * Interferjs umożliwiający odbieranie obiektów.
 * 
 * @author Michał Żurawski
 */
public interface Odbieralny {

    /**
     * Funkcja odbierająca komunikat od serwera.
     *
     * @param komunikat Treść komunikatu.
     */
    void odbierz(final Object komunikat);
}
