package Obuke;

public class ObukaPolaznika {
    private static int poslednjiBroj;
    private int registracioniBroj;
    private Obuka obuka;
    private Polaznik polaznik;

    public ObukaPolaznika(Obuka obuka, Polaznik polaznik) {
        this.obuka = obuka;
        this.polaznik = polaznik;
    }

    public ObukaPolaznika(Obuka obuka) {
        this.obuka = obuka;
    }

    public ObukaPolaznika(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public static int getPoslednjiBroj() {
        return poslednjiBroj;
    }

    public static void setPoslednjiBroj(int poslednjiBroj) {
        ObukaPolaznika.poslednjiBroj = poslednjiBroj;
    }

    public int getRegistracioniBroj() {
        return registracioniBroj;
    }

    public void setRegistracioniBroj(int registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    public Obuka getObuka() {
        return obuka;
    }

    public void setObuka(Obuka obuka) {
        this.obuka = obuka;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    @Override
    public String toString() {
        return obuka.toString();
    }
}
