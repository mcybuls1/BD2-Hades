package pl.hades.model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.hades.baza.Firma;
import pl.hades.baza.Karawan;
import pl.hades.baza.Miejsce;
import pl.hades.baza.Zlecenie;
import pl.hades.baza.Zleceniodawca;
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
    
    public void dodajKarawan(final Karawan karawan)
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(karawan);
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
    }
    
    public void dodajMiejsce(final Miejsce miejsce)
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(miejsce);
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
    }
    
    public void dodajFirme(final Firma firma)
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(firma);
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
    }
    
    public ArrayList<Zlecenie> pobierzZlecenia()
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        final ArrayList<Zlecenie> zlecenia = new ArrayList<>();
        try
        {
            transaction = session.beginTransaction();
            for (Object zleceniodawca : session.createQuery("FROM Zleceniodawca").list())
            {
                final Zlecenie zlecenie = new Zlecenie();
                final Zleceniodawca z = (Zleceniodawca) zleceniodawca;
                Hibernate.initialize(z);
                Hibernate.initialize(z.getZmarly());
                Hibernate.initialize(z.getZmarly().getPogrzeb().getKarawan());
                zlecenie.setZleceniodawca(z);
                zlecenia.add(zlecenie);
            }
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
        return zlecenia;
    }
    
    public ArrayList<Firma> pobierzFirmy()
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        final ArrayList<Firma> firmy = new ArrayList<>();
        try
        {
            transaction = session.beginTransaction();
            for (Object f : session.createQuery("FROM Firma").list())
            {
                final Firma firma = (Firma) f;
                Hibernate.initialize(firma);
                firmy.add(firma);
            }
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
        return firmy;
    }

    public ArrayList<Miejsce> pobierzMiejsca()
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        final ArrayList<Miejsce> miejsca = new ArrayList<>();
        try
        {
            transaction = session.beginTransaction();
            for (Object m : session.createQuery("FROM Miejsca").list())
            {
                final Miejsce miejsce = (Miejsce) m;
                Hibernate.initialize(miejsce);
                miejsca.add(miejsce);
            }
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
        return miejsca;
    }
    
    public void dodajZlecenie(final Zlecenie zlecenie)
    {
        final Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(zlecenie.getZleceniodawca());
            transaction.commit();
        }
        catch (HibernateException e)
        {
            if (transaction != null)
            {
                transaction.rollback();
                throw e;
            }
        }
        finally
        {
            session.close();
        }
    }
}
