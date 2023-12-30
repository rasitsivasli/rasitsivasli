package Privat.DE25_InHeritance.Task03;

public class Kisi {
    private int kimlikNo;
    private String isim;
    private int yas;

    public Kisi() {
    }

    public Kisi(int kimlikNo, String isim, int yas) {
        this.kimlikNo = kimlikNo;
        this.isim = isim;
        this.yas = yas;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "kimlikNo=" + kimlikNo +
                ", isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
