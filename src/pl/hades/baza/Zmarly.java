/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.hades.baza;

/**
 *
 * @author Mikolaj Cybulski
 */
public class Zmarly implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String dataZgonu;
    private Pogrzeb pogrzeb;

    public Pogrzeb getPogrzeb()
    {
        return pogrzeb;
    }

    public void setPogrzeb(Pogrzeb pogrzeb)
    {
        this.pogrzeb = pogrzeb;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getDataUrodzenia()
    {
        return dataUrodzenia;
    }

    public String getDataZgonu()
    {
        return dataZgonu;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setDataUrodzenia(String dataUrodzenia)
    {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setDataZgonu(String dataZgonu)
    {
        this.dataZgonu = dataZgonu;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
}
