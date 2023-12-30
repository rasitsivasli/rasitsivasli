package Privat.DE25_InHeritance.Task03;

public class Ogrenci extends Kisi {
    private int sinif;
    private int ogrenciNo;

    public Ogrenci() {
    }

    public Ogrenci(int sinif, int ogrenciNo) {
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(int kimlikNo, String isim, int yas, int sinif, int ogrenciNo) {
        super(kimlikNo, isim, yas);
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "sinif=" + sinif +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }
}
