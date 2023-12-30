package Privat.DE31_Maps.MapProje;

import java.util.Scanner;

public class Islemler {
    public static void veriAdd(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String adSoyad = scan.nextLine();
        System.out.print("Telefon numarinizi giriniz (alan kodu ve sifir olmadan) : ");
        String tel = scan.next();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Adresinizi giriniz : ");
        String adres = scan1.nextLine();
        System.out.print("Mail adresinizi giriniz : ");
        String eMail = scan.next();
        int id = ++Runner.adresSonID;
        boolean statu = true;

    }

    public static void veriDelete(){
        // ID yi sor, bu ID array listte bul bu ID nın olduğu kayıtta durumu false yap

        // dosyaya diziyi yazdırabiliriz
    }
    public static void veriUpdate(){
        // ID yi sor, bu ID array listte bul bu ID nın olduğu kayıtta durumu false yap

        // dosyaya diziyi yazdırabiliriz
    }

    public static void veriList(){
        // verileri ekrana yaz ama durum  = true olanları
        String line = String.format("%5s","  ID ");
        line  = line + String.format("%30s","Ad Soyad");
        line  = line + String.format("%15s","Telefon");
        line  = line + String.format("%25s","eMail");
        line  = line + String.format("%30s","Adress");
        System.out.println(line);
        line = String.format("%5s","=====");
        line  = line + String.format("%30s","=========");
        line  = line + String.format("%15s","=========");
        line  = line + String.format("%25s","=========");
        line  = line + String.format("%30s","=========");
        System.out.println(line);
        for (int i = 0; i < Runner.liste.size() ; i++) {
            System.out.println(Runner.liste.get(i));
        }
    }

    public static void veriSilinmisListele(){
        // verileri ekrana yaz ama durum  = false olanları
    }




}
