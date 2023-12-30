package Privat.DE26_Exception.j26_Exceptions.Tasks.Task04.KendiCozumum;

public class Ogrenci {
    /*1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

     2- fieldları okulAd, maxOgrenciSayisi,
        ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,

     3- main metodunun olduğu OkulMain isimli bir class create ediniz.

     4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.*/
    private String ad;
    private String soyaAd;
    private int yas;

    public Ogrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyaAd() {
        return soyaAd;
    }

    public void setSoyaAd(String soyaAd) {
        this.soyaAd = soyaAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyaAd='" + soyaAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
