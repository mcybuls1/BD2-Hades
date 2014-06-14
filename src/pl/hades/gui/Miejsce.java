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
public class Miejsce implements java.io.Serializable {
    
    private String ulica;
    private String miasto;
    private Integer nrBudynku;
    private Integer nrMieszkania;

    public String getMiasto() {
        return miasto;
    }

    public Integer getNrBudynku() {
        return nrBudynku;
    }

    public Integer getNrMieszkania() {
        return nrMieszkania;
    }

    public String getUlica() {
        return ulica;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setNrBudynku(Integer nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public void setNrMieszkania(Integer nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }
    
    
}
