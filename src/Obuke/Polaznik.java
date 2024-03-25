package Obuke;

import java.util.ArrayList;

import static java.lang.constant.ConstantDescs.NULL;
import java.util.Random;
public class Polaznik implements Registracija{
    private String ime;
    private String prezime;
    private String email;
    private ArrayList<ObukaPolaznika> obuke = new ArrayList<>();

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<ObukaPolaznika> getObuke() {
        return obuke;
    }

    public void setObuke(ArrayList<ObukaPolaznika> obuke) {
        this.obuke = obuke;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean registrovan(Obuka obuka) {
        for(ObukaPolaznika o : obuke){
            if(obuka.getObukePolaznika().contains(o)) return true;
        }
        return false;
    }
    @Override
    public boolean registruj(Obuka obuka) {

        if(!email.isEmpty() && email.contains("@") && !registrovan(obuka)){
            ObukaPolaznika o = new ObukaPolaznika(obuka, this);
            obuka.getObukePolaznika().add(o);
            obuke.add(o);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Polaznik: " + ime + " " + prezime + " [" + email + "]";
    }

}
