package pl.hades.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pl.hades.kontroler.Kontroler;

/**
 * Klasa tworząca i przechowująca listę stołów, na których odbywają się
 * rozgrywki dla wielu osób. Gra może być dowolnego typu, jednakże jeden model
 * może przechowywać co najwyżej jedną rozgrywkę danego typu.
 *
 * @see Gra
 * @author Michał Żurawski
 */
public class Model
{
    /** Dostęp do bazy danych. */
    private final SessionFactory sessionFactory;
    /** Kontroler, który przekazuje dane. */
    private Kontroler kontroler;

    /**
     * Utworzenie modelu oraz połączenie z bazą danych.
     *
     */
    public Model()
    {
        final Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    /**
     * Ustawia kontroler, który przekazuje informację do widoku.
     *
     * @param kontroler Kontroler, który przekazuje informację do widoku.
     */
    public void setKontroler(final Kontroler kontroler)
    {
        this.kontroler = kontroler;
    }
}
