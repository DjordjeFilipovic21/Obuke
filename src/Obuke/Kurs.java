package Obuke;

import java.util.ArrayList;

public class Kurs extends Obuka{
    private boolean onlajn;
    private ArrayList<Kurs> preduslovi;
    public Kurs(String naziv, int minimalanBrojPolaznika, Oblast oblast, boolean onlajn) {
        super(naziv, minimalanBrojPolaznika, oblast);
        this.onlajn = onlajn;
    }

    public boolean isOnlajn() {
        return onlajn;
    }

    public void setOnlajn(boolean onlajn) {
        this.onlajn = onlajn;
    }

    public ArrayList<Kurs> getPreduslovi() {
        return preduslovi;
    }

    public void setPreduslovi(ArrayList<Kurs> preduslovi) {
        this.preduslovi = preduslovi;
    }

    @Override
    public String toString() {
        String s;
        if(onlajn)
            s = "Onlajn";
        else
            s = "Uzivo";
        return getNaziv() + " " + getObukePolaznika().size() + " " + this.getClass().getSimpleName() + " " + s;
    }
}
