/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.hades.gui;

/**
 *
 * @author Mikolaj Cybulski
 */
public class Zmarly implements java.io.Serializable {
    
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String dataZgonu;
    private String wyznanie;
    private String sposobPochowku;

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getDataZgonu() {
        return dataZgonu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getSposobPochowku() {
        return sposobPochowku;
    }

    public String getWyznanie() {
        return wyznanie;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setDataZgonu(String dataZgonu) {
        this.dataZgonu = dataZgonu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setSposobPochowku(String sposobPochowku) {
        this.sposobPochowku = sposobPochowku;
    }

    public void setWyznanie(String wyznanie) {
        this.wyznanie = wyznanie;
    }
    
    
}
