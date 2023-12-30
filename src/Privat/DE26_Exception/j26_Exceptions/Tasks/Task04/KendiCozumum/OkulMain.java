package Privat.DE26_Exception.j26_Exceptions.Tasks.Task04.KendiCozumum;

import java.util.Scanner;

public class OkulMain {
    /*1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

2- fieldları okulAd, maxOgrenciSayisi,
ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,

3- main metodunun olduğu OkulMain isimli bir class create ediniz.

4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.*/
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Okul okul = new Okul();
        okul.okulAd = "Clarusway";
        okul.maxOgrenciSayisi = 2;

        for (int i = 0; i < okul.maxOgrenciSayisi; i++) {
            Ogrenci ogr = new Ogrenci();
            ogrenciEkleMethodu(i, okul, ogr);
            System.out.println(i + 1 + ". Ogrenci : " + okul.ogrenciListesi.get(i));
        }
        System.out.println("okul = " + okul);
        System.out.println("okul.ogrenciListesi = " + okul.ogrenciListesi);

    }

    private static void ogrenciEkleMethodu(int i, Okul okul, Ogrenci ogr) {

        System.out.print(i + 1 + ". Ogrencinin adini giriniz : ");
        ogr.setAd(scanner.next());
        System.out.print(i + 1 + ". Ogrencinin soyadini giriniz : ");
        ogr.setSoyaAd(scanner.next());
        System.out.print(i + 1 + ". Ogrencinin yasini giriniz : ");

        try {
            ogr.setYas(scanner.nextInt());
            if (ogr.getYas() < 8 || ogr.getYas() > 15) throw new Exception();
            else okul.ogrenciListesi.add(ogr);
        } catch (Exception ex) {
            System.out.println("Ogrenci yasi 8 ile 15 arasında olmalıdır. Tekrar giriniz.");
            ogrenciEkleMethodu(i, okul, ogr);
        }


    }


}
