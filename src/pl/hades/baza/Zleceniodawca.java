package pl.hades.baza;

/**
 *
 * @author Mikolaj Cybulski
 */
public class Zleceniodawca implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String imie;
    private String nazwisko;
    private String wiezZeZmarlym;
    private Zmarly zmarly;

    public String getImie()
    {
        return imie;
    }

    public Zmarly getZmarly()
    {
        return zmarly;
    }

    public void setZmarly(Zmarly zmarly)
    {
        this.zmarly = zmarly;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getWiezZeZmarlym()
    {
        return wiezZeZmarlym;
    }

    public void setWiezZeZmarlym(String wiezZeZmarlym)
    {
        this.wiezZeZmarlym = wiezZeZmarlym;
    }
}
