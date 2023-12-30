package Privat.Projeler.ProjeSablonVonFarukHoca;

import java.util.Map;
import java.util.Scanner;

public class IslemKisiler {
    public static void veriAdd(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String adSoyad = scan.nextLine();
        System.out.print("Telefon numarinizi giriniz (alan kodu ve sifir olmadan) : ");
        String tel = scan.nextLine();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Adresinizi giriniz : ");
        String adres = scan1.nextLine();
        System.out.print("Mail adresinizi giriniz : ");
        String eMail = scan.next();
        int id = ++Runner.adresSonID;
        boolean statu = true;
        Kisiler kayit = new Kisiler(id, adSoyad, adres, eMail,tel, statu);
        Runner.liste.put(kayit.getId(), kayit);
        FileKisiler dbFH = new FileKisiler();
        dbFH.dosyayaYaz();


       // kullanıcıdan veri alınıp listeye konulacak
       // id yi siz hesaplayın

       // durum = true
       // dosyaya diziyi yazdırabiliriz
    }
    public static void veriDelete(){
        veriList();
        System.out.print("Silinecek kaydın ID sini giriniz : ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();

        if (!Runner.liste.containsKey(id)) {
            System.out.println("Bu ID bulunamadı");
        }else {
            Kisiler kisi = Runner.liste.get(id);
            if (kisi.isDurum()) {
                Runner.liste.get(id).setDurum(false);
                System.out.println(id+" nolu id başarı ile silindi");
                FileKisiler dbFK = new FileKisiler();
                dbFK.dosyayaYaz();
            }
            else System.out.println("bu kayıt zaten daha önce silinmiş");
        }

    }
    public static void veriUpdate(){
        veriList();
        System.out.print("Değiştirilecek kaydın ID sini giriniz : ");
        Scanner scanNL = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int id = scan1.nextInt();

        if (!Runner.liste.containsKey(id)) {
            System.out.println("Bu ID bulunamadı");
        }else {
            Kisiler kisi = Runner.liste.get(id);
            if (kisi.isDurum()) {
                System.out.println("Değiştirmeyeceğiniz kayıtlar işin * yazınız");

                System.out.print("Yeni AdSoyad giriniz : ");
                String adSoyad = scanNL.nextLine();
                if (adSoyad.equals("*")) adSoyad = kisi.getAdSoyad();
                /* bunun yerine alttaki de olur ancak burumda , alttaki maddeler
                içinde bu yapılmalı ve
                 kisi = new Kisiler(id,adSoyad,adres,eMail,tel, kisi.isDurum());
                 satırı kaldırılmalı
                if (!adSoyad.equals("*")) kisi.setAdSoyad(adSoyad);
               */

                System.out.print("Telefon numarinizi giriniz (alan kodu ve sifir olmadan) : ");
                String tel = scanNL.nextLine();
                if (tel.equals("*")) tel = kisi.getTel();

                System.out.print("Adresinizi giriniz : ");
                String adres = scanNL.nextLine();
                if (adres.equals("*")) adres = kisi.getAdres();

                System.out.print("Mail adresinizi giriniz : ");
                String eMail = scanNL.nextLine();
                if (eMail.equals("*")) eMail= kisi.geteMail();

                kisi = new Kisiler(id,adSoyad,adres,eMail,tel, kisi.isDurum());

                Runner.liste.put(id,kisi);

                System.out.println(id+" nolu id başarı ile güncellendi");
                FileKisiler dbFK = new FileKisiler();
                dbFK.dosyayaYaz();
            }
            else System.out.println("bu kayıt daha önce silinmiş");
        }
        // ID yi sor, bu ID array listte bul bu ID nın olduğu kayıtta durumu false yap

        // dosyaya diziyi yazdırabiliriz
    }

    public static void veriList(){
        // verileri ekrana yaz ama durum  = true olanları
        System.out.println("   AKtif Adres Listesi");
        String baslik = String.format("%5s","  ID ");
        baslik  = baslik + String.format("%30s","Ad Soyad");
        baslik  = baslik + String.format("%15s","Telefon");
        baslik  = baslik + String.format("%25s","eMail");
        baslik  = baslik + String.format("%30s","Adress");
        System.out.println(baslik);
        String cizgi = String.format("%5s","=====");
        cizgi  = cizgi + String.format("%30s","=========");
        cizgi  = cizgi + String.format("%15s","=========");
        cizgi  = cizgi + String.format("%25s","=========");
        cizgi  = cizgi + String.format("%30s","=========");
        System.out.println(cizgi);
       for (Map.Entry<Integer,Kisiler> val:Runner.liste.entrySet()) {
           if (val.getValue().isDurum()) {
               System.out.println(val.getValue());
           }
       }
    }
    public static void veriListSilinmisler(){
        // verileri ekrana yaz ama durum  = true olanları
        System.out.println("   Silinmiş Adres Listesi");
        String baslik = String.format("%5s","  ID ");
        baslik  = baslik + String.format("%30s","Ad Soyad");
        baslik  = baslik + String.format("%15s","Telefon");
        baslik  = baslik + String.format("%25s","eMail");
        baslik  = baslik + String.format("%30s","Adress");
        System.out.println(baslik);
        String cizgi = String.format("%5s","=====");
        cizgi  = cizgi + String.format("%30s","=========");
        cizgi  = cizgi + String.format("%15s","=========");
        cizgi  = cizgi + String.format("%25s","=========");
        cizgi  = cizgi + String.format("%30s","=========");
        System.out.println(cizgi);
        for (Map.Entry<Integer,Kisiler> val:Runner.liste.entrySet()) {
            if (!val.getValue().isDurum()) {
                System.out.println(val.getValue());
            }
        }
    }



    public static void veriOku(){
        FileKisiler dbFH = new FileKisiler();
        dbFH.dosyadanOku();
    }



}
