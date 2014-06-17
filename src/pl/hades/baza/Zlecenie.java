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
public class Zlecenie implements  java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private Zleceniodawca zleceniodawca;
    private Zmarly zmarly;
    private Firma firma;
    private Miejsce miejsceStypy;
    private Miejsce cmentarz;
    private String dataStypogrzebu;

    public Miejsce getCmentarz() {
        return cmentarz;
    }

    public String getDataStypogrzebu() {
        return dataStypogrzebu;
    }

    public Firma getFirma() {
        return firma;
    }

    public Miejsce getMiejsceStypy() {
        return miejsceStypy;
    }

    public Zleceniodawca getZleceniodawca() {
        return zleceniodawca;
    }

    public Zmarly getZmarly() {
        return zmarly;
    }

    public void setCmentarz(Miejsce cmentarz) {
        this.cmentarz = cmentarz;
    }

    public void setDataStypogrzebu(String dataStypogrzebu) {
        this.dataStypogrzebu = dataStypogrzebu;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public void setMiejsceStypy(Miejsce miejsceStypy) {
        this.miejsceStypy = miejsceStypy;
    }

    public void setZleceniodawca(Zleceniodawca zleceniodawca) {
        this.zleceniodawca = zleceniodawca;
    }

    public void setZmarly(Zmarly zmarly) {
        this.zmarly = zmarly;
    }
    
    
}
