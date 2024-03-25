package Obuke;

import java.util.ArrayList;

public class Profesor implements Registracija{
    private String ime;
    private String prezime;
    private String id;
    private Oblast oblast;
    private ArrayList<Obuka> obuke;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public ArrayList<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(ArrayList<Obuka> obuke) {
        this.obuke = obuke;
    }

    public Profesor(String ime, String prezime, String id, Oblast oblast) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.oblast = oblast;
    }

    @Override
    public boolean registruj(Obuka obuka) {
        if(obuka.getOblast()==oblast && !registrovan(obuka) && obuke.size()<=3){
            obuke.add(obuka);
            return true;
        }
        return false;
    }

    @Override
    public boolean registrovan(Obuka obuka) {
        for(Obuka o : obuke){
            if(o == obuka)
                return true;
        }
        return false;
    }
}
