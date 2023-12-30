package Privat.DE28_Interface.Tasks.Task04;

public class Isci implements Personel{
    String ad;

    @Override
    public int maasHesapla(int saatUcreti, int calismaSuresi) {

        return saatUcreti*calismaSuresi;
    }

    public Isci(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "ad='" + ad + '\'' +
                '}';
    }

    public Isci() {
    }
}
