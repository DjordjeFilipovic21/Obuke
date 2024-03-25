package Obuke;

import java.util.ArrayList;

public abstract class Obuka{
    private String naziv;
    private int minimalanBrojPolaznika;
    private Oblast oblast;
    public ArrayList<ObukaPolaznika> obukePolaznika = new ArrayList<>();
    private ArrayList<Profesor> predavaci = new ArrayList<>();

    public ArrayList<ObukaPolaznika> getObukePolaznika() {
        return obukePolaznika;
    }

    public void setObukePolaznika(ArrayList<ObukaPolaznika> obukePolaznika) {
        this.obukePolaznika = obukePolaznika;
    }

    public ArrayList<Profesor> getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(ArrayList<Profesor> predavaci) {
        this.predavaci = predavaci;
    }



    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getMinimalanBrojPolaznika() {
        return minimalanBrojPolaznika;
    }

    public void setMinimalanBrojPolaznika(int minimalanBrojPolaznika) {
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public Obuka(String naziv, int minimalanBrojPolaznika, Oblast oblast) {
        this.naziv = naziv;
        this.minimalanBrojPolaznika = minimalanBrojPolaznika;
        this.oblast = oblast;
    }



    @Override
    public String toString() {
        return getNaziv();
    }
}
