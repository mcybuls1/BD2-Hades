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
public class Firma implements java.io.Serializable {
    
    private String nazwa;
    private String nrKonta;
    private String nip;
    private String rodzajUslugi;

    public String getNazwa() {
        return nazwa;
    }

    public String getNip() {
        return nip;
    }

    public String getNrKonta() {
        return nrKonta;
    }

    public String getRodzajUslugi() {
        return rodzajUslugi;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

    public void setRodzajUslugi(String rodzajUslugi) {
        this.rodzajUslugi = rodzajUslugi;
    }
    
    
}
