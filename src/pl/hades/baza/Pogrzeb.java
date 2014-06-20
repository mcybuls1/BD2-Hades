package pl.hades.baza;

import java.io.Serializable;

/**
 *
 * @author Michał Żurawski
 */
public class Pogrzeb implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String sposobPochowku;
    private String religia;
    private String data;
    private Miejsce miejsce;
    private Karawan karawan;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getReligia()
    {
        return religia;
    }

    public void setReligia(String religia)
    {
        this.religia = religia;
    }

    public String getSposobPochowku()
    {
        return sposobPochowku;
    }

    public void setSposobPochowku(String sposobPochowku)
    {
        this.sposobPochowku = sposobPochowku;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public Miejsce getMiejsce()
    {
        return miejsce;
    }

    public void setMiejsce(Miejsce miejsce)
    {
        this.miejsce = miejsce;
    }

    public Karawan getKarawan()
    {
        return karawan;
    }

    public void setKarawan(Karawan karawan)
    {
        this.karawan = karawan;
    } 
}
