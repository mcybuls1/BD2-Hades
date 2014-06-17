package pl.hades.baza;

/**
 *
 * @author Mikolaj Cybulski
 */
public class Miejsce implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String ulica;
    private String miasto;
    private Integer nrBudynku;
    private Integer nrMieszkania;
    private Integer pojemnosc;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getPojemnosc()
    {
        return pojemnosc;
    }

    public void setPojemnosc(Integer pojemnosc)
    {
        this.pojemnosc = pojemnosc;
    }

    public String getMiasto()
    {
        return miasto;
    }

    public Integer getNrBudynku()
    {
        return nrBudynku;
    }

    public Integer getNrMieszkania()
    {
        return nrMieszkania;
    }

    public String getUlica()
    {
        return ulica;
    }

    public void setMiasto(String miasto)
    {
        this.miasto = miasto;
    }

    public void setNrBudynku(Integer nrBudynku)
    {
        this.nrBudynku = nrBudynku;
    }

    public void setNrMieszkania(Integer nrMieszkania)
    {
        this.nrMieszkania = nrMieszkania;
    }

    public void setUlica(String ulica)
    {
        this.ulica = ulica;
    }
}
