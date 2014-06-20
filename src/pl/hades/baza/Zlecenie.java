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
    private Firma firma;

    public String getDataStypogrzebu() {
        return zleceniodawca.getZmarly().getPogrzeb().getData();
    }

    public Firma getFirma() {
        return firma;
    }

    public Miejsce getMiejsceStypy() {
        return firma.getMiejsce();
    }

    public Zleceniodawca getZleceniodawca() {
        return zleceniodawca;
    }

    public Zmarly getZmarly() {
        return zleceniodawca.getZmarly();
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public void setZleceniodawca(Zleceniodawca zleceniodawca) {
        this.zleceniodawca = zleceniodawca;
    }
    
}
