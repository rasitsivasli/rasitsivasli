package Privat.DE26_Exception.j26_Exceptions.Tasks.Task04.KendiCozumum;

import java.util.ArrayList;

public class Okul {
    /*1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

    2- fieldları okulAd, maxOgrenciSayisi,
       ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,

    3- main metodunun olduğu OkulMain isimli bir class create ediniz.

    4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
       ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
       bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.*/


    String okulAd;
    int maxOgrenciSayisi;
    ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();

    public Okul(String okulAd) {
        this.okulAd = okulAd;
    }

    public Okul(String okulAd, int maxOgrenciSayisi, ArrayList<Ogrenci> ogrenciListesi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciListesi = ogrenciListesi;
    }

    public Okul() {

    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOkul() {
        return ogrenciListesi;
    }

    public void setOkul(ArrayList<Ogrenci> okul) {
        this.ogrenciListesi = okul;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", okul=" + ogrenciListesi +
                '}';
    }
}
