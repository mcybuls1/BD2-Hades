package pl.hades;

import pl.hades.kontroler.Kontroler;
import pl.hades.model.Model;
import pl.hades.serwersocket.BladPolaczeniaException;
import pl.hades.serwersocket.SerwerSocket;

/**
 * Utorzenie modelu oraz odpalenie serweru.
 *
 * @author Michał Żurawski
 */
public class Main
{
    private static final int PORT = 4269;

    public static void main(String[] args) throws BladPolaczeniaException
    {
        final Model model = new Model();
        final Kontroler kontroler = new Kontroler(model);
        model.setKontroler(kontroler);
        final SerwerSocket serwer = new SerwerSocket(PORT, kontroler);
        kontroler.setSerwer(serwer);
        serwer.start();
        System.out.println("Nawiązano połączenie na porcie " + PORT);
    }
}
