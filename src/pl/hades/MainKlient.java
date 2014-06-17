package pl.hades;

import javax.swing.JOptionPane;
import pl.hades.klientsocket.KlientSocket;
import pl.hades.serwersocket.BladPolaczeniaException;
import pl.hades.widok.Widok;

/**
 * Utorzenie widoku oraz połączenie z serwerem.
 *
 * @author Michał Żurawski
 */
public class MainKlient
{
    private static final int PORT = 4269;
    private static final String HOST = "localhost";

    public static void main(String[] args)
    {
        try
        {
            final KlientSocket klientSocket = new KlientSocket(PORT, HOST);
            klientSocket.start();
            final Widok widok = new Widok(klientSocket);
            widok.wyswietl();
        }
        catch (BladPolaczeniaException ex)
        {
            JOptionPane.showMessageDialog(null,
                    "Nie można ustanowić połączenia z serwerem. Proszę spróbować ponownie.",
                    "Błąd polączenia", JOptionPane.ERROR_MESSAGE);
        }
    }
}
