package Obuke;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coursera coursera = new Coursera();
        Polaznik p1 = new Polaznik("Pera", "Peric", "peric43ri@raf.rs");
        Polaznik p2 = new Polaznik("Mirko", "Dare", "dare23rn@raf.rs");
        Polaznik p3 = new Polaznik("Morgan", "Sir", "sir24ri@raf.rs");
        Polaznik p4 = new Polaznik("Darko", "Ased", "ased39ri@raf.rs");
        Polaznik p5 = new Polaznik("Uros", "Golman", "golman34ri@raf.rs");
        Profesor prof1 = new Profesor("Jovan", "Redzic", "3212", Oblast.PROGRAMIRANJE);
        Profesor prof2 = new Profesor("Marko", "Surla", "1212", Oblast.PROGRAMIRANJE);
        Kurs UUP = new Kurs("UUP", 2, Oblast.PROGRAMIRANJE, true);
        Kurs OOP = new Kurs("OOP", 2,Oblast.PROGRAMIRANJE, false);
        Projekat proj1 = new Projekat("Obuke", 2, Oblast.PROGRAMIRANJE, 4);
        Projekat proj2 = new Projekat("Studio", 2, Oblast.PROGRAMIRANJE, 5);
        ArrayList<Obuka> obuke = new ArrayList<>();
        obuke.add(UUP);
        obuke.add(OOP);
        obuke.add(proj1);
        obuke.add(proj2);
        coursera.setObuke(obuke);
        p1.registruj(UUP);
        p1.registruj(OOP);
        p2.registruj(UUP);
        p3.registruj(OOP);
        p4.registruj(proj1);
        p5.registruj(proj1);
        p2.registruj(OOP);
        ArrayList<Polaznik> polaznici = new ArrayList<>();
        polaznici.add(p4);
        Tim tim = new Tim(p1, polaznici);
        coursera.sveObukePolaznika(p1);
        coursera.sveObukeKojeSeDrze();






    }
}