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
public class Zleceniodawca implements java.io.Serializable {
    
    private String imie;
    private String nazwisko;
    private String wiezZeZmarlym;

    public String getImieZleceniodawcy() {
        return imie;
    }

    public String getNazwiskoZleceniodawcy() {
        return nazwisko;
    }

    public String getWiezZeZmarlym() {
        return wiezZeZmarlym;
    }

    public void setImieZleceniodawcy(String imieZleceniodawcy) {
        this.imie = imieZleceniodawcy;
    }

    public void setNazwiskoZleceniodawcy(String nazwiskoZleceniodawcy) {
        this.nazwisko = nazwiskoZleceniodawcy;
    }

    public void setWiezZeZmarlym(String wiezZeZmarlym) {
        this.wiezZeZmarlym = wiezZeZmarlym;
    }
    
    
}
