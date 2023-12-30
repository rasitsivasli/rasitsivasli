package CodeChallenges.Projeler.KahveProjesi.Proje2_KahveProje_BizimGrup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kahve {

    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    int kahveSecimi;
    int kahveFiyat;
    int kahveBoy;
    String sutEklensinMi;
    String sekerEklensinMi;
    int kacSeker;
    int paraGirisi;
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println(BOLD+c_GREEN+"""
                                    Fiyat Menüsü:
                                    
                                    Küçük        Orta        Büyük
                   1.Türk kahvesi   30Tl         40Tl          50Tl
                   2.Filtre         35Tl         45Tl          55Tl
                   3.Espresso       40Tl         50Tl          60Tl
                   * İlave Süt 10Tl\
            
                """);

        System.out.println(c_GREEN+BOLD+"""
                 Hangi Kahveyi İstersiniz?
                  1.Türk kahvesi
                  2.Filtre Kahve
                  3.Espresso
                """);
        try {
            Scanner scanner = new Scanner(System.in);
            kahveSecimi = scanner.nextInt();
            if (kahveSecimi == 1) {
                kahveFiyat = 30;
            } else if (kahveSecimi == 2) {
                kahveFiyat = 35;
            } else if (kahveSecimi == 3) {
                kahveFiyat = 40;
            } else if (kahveSecimi == 4) {
                System.out.println(c_RED+"Cikis yaptiniz");
                System.exit(0);
            } else {
                System.out.println(c_RED+"Hatali giris yaptiniz");
                menu();
            }
        } catch (Exception e) {
            System.out.println(c_RED+"Hatali giris yaptiniz");
            menu();
        }
        kahveBoy();
    }

    public void kahveBoy() {
        System.out.println(c_GREEN+BOLD+"Hangi boy kahve alirsiniz?" +
                "         \n1. Kucuk" +
                "         \n2. Orta" +
                "         \n3. Buyuk " +
                "         \n4. Cikis  ");
        try {
            kahveBoy = scanner.nextInt();

            if (kahveBoy == 1) {
                System.out.println(c_GREEN+"Kucuk boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 2) {
                kahveFiyat += 10;
                System.out.println(c_GREEN+"Orta boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 3) {
                kahveFiyat += 20;
                System.out.println(c_GREEN+"Buyuk boy " + kahveListesi.get(kahveSecimi - 1) + " hazirlaniyor");
            } else if (kahveBoy == 4) {
                System.out.println(c_RED+"Cikis yaptiniz");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(c_RED+"Hatali giris yaptiniz");
            menu();
        }
        sutVeSekerEkleme();
    }

    public void sutVeSekerEkleme() {
        System.out.println();
        System.out.print(c_PURPLE+"Sut eklemek istiyor musunuz?\n(Evet veya Hayır olarak cevaplayınız) : ");
        sutEklensinMi = scanner.next();
        if (sutEklensinMi.substring(0, 1).equalsIgnoreCase("e")) {
            sutEklensinMi = "Sütlü";
            kahveFiyat += 10;
            System.out.println(c_PURPLE+"Kahvenize süt ekleniyor");
        } else if (sutEklensinMi.substring(0, 1).equalsIgnoreCase("h")){
            sutEklensinMi = "Sütsüz";
            System.out.println(c_PURPLE+"Süt eklenmiyor");
        }else {
            System.out.println("Yanlis giris yaptiniz.");
            sutVeSekerEkleme();
        }

        System.out.println();

        System.out.print("Seker eklemek istiyor musunuz?\n(Evet veya Hayır olarak cevaplayınız) : ");
        sekerEklensinMi = scanner.next();
        if (sekerEklensinMi.substring(0, 1).equalsIgnoreCase("e")) {
            sekerEklensinMi = "Sekerli";
            System.out.println();
            System.out.print(c_GREEN+"Kac seker istersiniz : ");
            kacSeker = scanner.nextInt();
            System.out.println(c_GREEN+"Kahvenize " + kacSeker + " seker ekleniyor");
        } else if (sekerEklensinMi.substring(0, 1).equalsIgnoreCase("h")){
            sekerEklensinMi = "Sekersiz";
            System.out.println(c_GREEN+"Seker eklenmiyor");
        }else {System.out.println("Yanlis giris yaptiniz.");
            ucretMetodu();
        }

    }

    public void ucretMetodu() {
        System.out.println();
        System.out.println(c_PURPLE+"Kahve ücreti " + kahveFiyat + " liradir");
        System.out.println(c_PURPLE+"Ucreti \"5-10-20-50'lik banknotlar olarak giriniz");
        paraGirisi = scanner.nextInt();
        while (!(paraGirisi == kahveFiyat)) {
            if (paraGirisi > kahveFiyat){
                System.out.println(Math.abs(kahveFiyat - paraGirisi) +c_PURPLE+ " tl para üstünü aliniz");break;
            }
            System.out.println(kahveFiyat - paraGirisi +c_PURPLE+ " lira eksik giris yaptiniz. Lütfen kalan tutari tamamlayiniz");
            paraGirisi += scanner.nextInt();

        }
        System.out.println(sutEklensinMi+" "+sekerEklensinMi+" "+
                Kahve.kahveListesi.get(kahveSecimi-1)+c_PURPLE+" hazirlanmisitir");
        System.out.println();

    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveSecimi=" + kahveListesi.get(kahveSecimi-1)+
                ", kahveFiyat=" + kahveFiyat +
                ", kahveBoy=" + kahveBoy +
                ", sutEklensinMi='" + sutEklensinMi + '\'' +
                ", sekerEklensinMi='" + sekerEklensinMi + '\'' +
                ", kacSeker=" + kacSeker +
                ", paraGirisi=" + paraGirisi +
                '}';
    }
}
