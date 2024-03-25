package Obuke;

public class Projekat extends Obuka{
    private int maksimalanBrojPolaznika;

    public int getMaksimalanBrojPolaznika() {
        return maksimalanBrojPolaznika;
    }

    public void setMaksimalanBrojPolaznika(int maksimalanBrojPolaznika) {
        this.maksimalanBrojPolaznika = maksimalanBrojPolaznika;
    }

    public Projekat(String naziv, int minimalanBrojPolaznika, Oblast oblast, int maksimalanBrojPolaznika) {
        super(naziv, minimalanBrojPolaznika, oblast);
        this.maksimalanBrojPolaznika = maksimalanBrojPolaznika;
    }


    @Override
    public String toString() {
        return getNaziv() + " " + getObukePolaznika().size() + " " + this.getClass().getSimpleName();
    }
}
