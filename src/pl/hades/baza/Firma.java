package pl.hades.baza;

/**
 *
 * @author Mikolaj Cybulski
 */
public class Firma implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nazwa;
    private String nrKonta;
    private String nip;
    private String rodzajUslugi;
    private Miejsce miejsce;

    public Miejsce getMiejsce()
    {
        return miejsce;
    }

    public void setMiejsce(Miejsce miejsce)
    {
        this.miejsce = miejsce;
    }

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
    
    @Override
    public String toString()
    {
        return nazwa;
    }
}
