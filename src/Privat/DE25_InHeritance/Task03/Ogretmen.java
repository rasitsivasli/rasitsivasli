package Privat.DE25_InHeritance.Task03;

public class Ogretmen extends Kisi{
    private String brans;
    private int deneyim;

    public Ogretmen() {
    }

    public Ogretmen(String brans, int deneyim) {
        this.brans = brans;
        this.deneyim = deneyim;

    }

    public Ogretmen(int kimlikNo, String isim, int yas, String brans, int deneyim) {
        super(kimlikNo, isim, yas);
        this.brans = brans;
        this.deneyim = deneyim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }

    @Override
    public String toString() {
        return "Ogretmen{"+super.toString()+
                "brans='" + brans + '\'' +
                ", deneyim=" + deneyim +
                '}';
    }
}
