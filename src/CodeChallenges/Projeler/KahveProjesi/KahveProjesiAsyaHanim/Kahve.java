package CodeChallenges.Projeler.KahveProjesi.KahveProjesiAsyaHanim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kahve {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    String name;
    String boy;
    String sut;
    String seker;
    int secim;
    int ucret = 0;

    public Kahve(String name, String boy, String sut, String seker, int ucret) {
        this.name = name;
        this.boy = boy;
        this.sut = sut;
        this.seker = seker;
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Kahve{" +
                "name='" + name + '\'' +
                ", boy='" + boy + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                ", ucret=" + ucret +
                '}';
    }

    public Kahve() {
    }

    public void kahveSec() {
        System.out.println("                 Fiyat Menüsü:\n" +
                "\n" +
                BOLD + "                 Küçük        Orta        Büyük   \n" +
                c_RED + "1.Türk kahvesi   30Tl         40Tl          50Tl \n" +
                c_PURPLE + "2.Latte          35Tl         45Tl          55Tl \n" +
                c_GREEN + "3.Espresso       40Tl         50Tl          60Tl \n" +
                "\n" +
                "* İlave Süt 10Tl  ");

        System.out.println(BOLD + "Hangi Kahveyi istersiniz?Lütfen dilediğiniz kahve numarasını seçin :");
        System.out.println(c_RED + " 1.Türk kahvesi\n" +
                c_PURPLE + " 2.Latte\n" +
                c_GREEN + " 3.Espresso");
        try {
            scanner = new Scanner(System.in);//scanner temizleniyor. Sonsuz döngü olmamasi icin gerekli..
            secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println(kahveListesi.get(secim - 1) + " hazırlanıyor.");
                name = kahveListesi.get(secim - 1);
                ucret = 30;
            } else if (secim == 2) {
                System.out.println(kahveListesi.get(secim - 1) + " hazırlanıyor.");
                name = kahveListesi.get(secim - 1);
                ucret = 35;
            } else if (secim == 3) {
                System.out.println(kahveListesi.get(secim - 1) + " hazırlanıyor.");
                name = kahveListesi.get(secim - 1);
                ucret = 40;
            }
        } catch (Exception e) {
            System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz");
            kahveSec();

        }


    }

    //todo ________SUT METHODU_____________________
    public void sutSec() {
        System.out.println(BOLD + "Kahvenize Süt Eklemek ister misiniz:");
        System.out.println(c_RED + " 1.Evet ise :E\n" +
                c_PURPLE + " 2.Değil ise  :H\n");
        String sutSecimi = scanner.next().substring(0, 1);

        if (sutSecimi.equalsIgnoreCase("E")) {
            System.out.println(BOLD + "Süt ekleniyor...");
            sut = "Sütlü";
            ucret += 10;

        } else if (sutSecimi.equalsIgnoreCase("H")) {
            System.out.println(BOLD + "Süt eklenmiyor...");
            sut = "Sade";
        } else {
            System.out.println("Hatalı giriş yaptınız lütfen tekar deneyiniz");
            sutSec();
        }
    }

    //todo ________SEKER METHODU_____________________
    public void sekerSec() {
        System.out.println(BOLD + "Kahvenize Seker Eklemek ister misiniz:");
        System.out.println(c_RED + " 1.Evet ise :E\n" +
                c_PURPLE + " 2.Değil ise  :H\n");
        String sekerSecimi = scanner.next().substring(0, 1);

        if (sekerSecimi.equalsIgnoreCase("E")) {
            System.out.println("Kaç şeker atarsınız:");
            int sekerSayisi = scanner.nextInt();
            System.out.println(BOLD + sekerSayisi + " Adet Seker ekleniyor...");
            seker = "Sekerli";

        } else if (sekerSecimi.equalsIgnoreCase("H")) {
            System.out.println(BOLD + "Seker eklenmiyor...");
            seker = "Sekersiz";
        } else {
            System.out.println("Hatalı giriş yaptınız lütfen tekar deneyiniz");
            sekerSec();
        }
    }


    //todo ________KAHVE BOY METHODU_____________________

    public void boySec() {
        System.out.println(BOLD + "Kahvenizi Hangi Boyda Almak İstersiniz:");
        System.out.println(c_RED + " 1.Büyük ise :B\n" +
                c_PURPLE + " 2.Orta ise   :M\n" +
                c_GREEN + " 3.Küçük ise  :S\n");
        String boySecimi = scanner.next().substring(0, 1);

        if (boySecimi.equalsIgnoreCase("B")) {
            boy = "Büyük";
            System.out.println("Kahveniz " + boy + " Boy Hazırlanıyor...");
            ucret += 20;


        } else if (boySecimi.equalsIgnoreCase("M")) {
            boy = "Orta";
            System.out.println("Kahveniz " + boy + " Boy Hazırlanıyor...");
            ucret += 10;

        } else if (boySecimi.equalsIgnoreCase("S")) {
            boy = "Küçük";
            System.out.println("Kahveniz " + boy + " Boy Hazırlanıyor...");

        } else {
            System.out.println("Hatalı giriş yaptınız lütfen tekar deneyiniz");
            boySec();
        }
    }

    public void UcretHesapla() {

        System.out.println("Kahveniz " + ucret + "Tl tutmuştur.");
        System.out.println("Ödeme yapmak için \"5-10-20-50'lik banknotlar\" giriniz:");
        int girilentutar = scanner.nextInt();
        System.out.println("Girilen Tutar:" + girilentutar + "Tl");
        if (ucret > girilentutar) {
            System.out.println("Eksik ödeme yapılmıştır");
            System.out.println((ucret - girilentutar) + "tl daha ödeme yapmanız gerekmektedir.");
            System.out.println("Devam etmek için :1 ");
            System.out.println("Siparişi iptal etmek için :2");
        } else {
            System.out.println("Ödeme için teşekkürler");
            System.out.println("Para üstünüz: " + (girilentutar - ucret) + "Tl");
        }
    }
}
