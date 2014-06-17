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
public class Karawan implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private String marka;
    private String model;
    private String nrRejestracyjny;
    private String rozmiarPaki;

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public String getRozmiarPaki() {
        return rozmiarPaki;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public void setRozmiarPaki(String rozmiarPaki) {
        this.rozmiarPaki = rozmiarPaki;
    }
    
    
}
