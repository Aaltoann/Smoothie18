package tikape.runko.domain;

import java.util.ArrayList;

public class Smoothie {

    private Integer id;
    private String nimi;
    private ArrayList ohje;

    public Smoothie(Integer id, String nimi, ArrayList ohje) {
        this.id = id;
        this.nimi = nimi;
        this.ohje = ohje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
        public ArrayList getOhje() {
        return ohje;
    }

    public void setOhje(ArrayList ohje) {
        this.ohje = ohje;
    }

    public void addOhje(String syote) {
        this.ohje.add(ohje.size(), syote);
    }
}
