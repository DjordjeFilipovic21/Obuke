package Obuke;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coursera{
    private ArrayList<Registracija> registracije;
    private ArrayList<Obuka> obuke = new ArrayList<>();
    public Coursera() {}
    public ArrayList<Registracija> getRegistracije() {
        return registracije;
    }

    public void setRegistracije(ArrayList<Registracija> registracije) {
        this.registracije = registracije;
    }

    public ArrayList<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(ArrayList<Obuka> obuke) {
        this.obuke = obuke;
    }
    public void sveObukePolaznika(Polaznik polaznik){
        System.out.println(polaznik + ", njegove obuke:");
        for(ObukaPolaznika o : polaznik.getObuke()){
            System.out.println(o.getObuka().getNaziv());
        }
    }
    public void sveObukeKojeSeDrze(){
        System.out.println("Sve obuke koje se drze sortirane po broju polaznika, pa po slovu:");
        ArrayList<Obuka> sveObuke = new ArrayList<>();
        for(Obuka o : obuke){
            if(o.getMinimalanBrojPolaznika()<=o.getObukePolaznika().size()) {
                sveObuke.add(o);
            }
        }
        sveObuke.sort(new Comparator<Obuka>() {
            @Override
            public int compare(Obuka o1, Obuka o2) {
                Integer vel1 = o1.getObukePolaznika().size();
                Integer vel2 = o2.getObukePolaznika().size();
                int Comp = vel1.compareTo(vel2)*-1;
                if(Comp!=0)//if not equal
                    return Comp;
                return o1.getNaziv().compareToIgnoreCase(o2.getNaziv());//if equal sort by name

            }
        });
        for(Obuka o : sveObuke){
            System.out.println(o);
        }
    }
    public boolean dodajRegistraciju(Registracija registracija){
        for(Registracija r : registracije)
        {
            if(r == registracija)
                return false;
        }
        registracije.add(registracija);
        return true;
    }
}
