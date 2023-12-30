package CodeChallenges.Projeler.ManavProjesi.Manav_SelbstCozum_Try_CatchIleTekrarCoz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav2 {
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> sebzeler = new ArrayList<>(Arrays.asList("Domates", "Biber", "Marul", "Roka", "Avakado"));
    static ArrayList<Integer> fiyatlar = new ArrayList<>(Arrays.asList(30, 40, 20, 40, 30));
    int secim;
    String secilenUrun;
    double kilo;
    double toplamFiyat;
    String alisVerisDevamMi;

    public void urunSecim() {
        System.out.println(BOLD+c_RED+"""
                Lütfen almak istetiginiz ürünü seciniz:
                Kilo/Fiyat
                 1. Domates :      30Tl
                 2. Biber   :      40Tl
                 3. Marul   :      20Tl
                 4. Roka    :      40Tl
                 5. Avakado :      30Tl""");
        try {
            secim = scanner.nextInt();
            if (secim > 0 && secim < 6) {
                secilenUrun = sebzeler.get(secim - 1);
            } else {
                System.out.println("Yanlis giris yaptiniz." +
                        "Secmek istediginiz ürünü tekrar giriniz");
                urunSecim();
            }

            System.out.print("Almak istediginiz miktari giriniz : ");
            kilo = scanner.nextDouble();
            toplamFiyat += fiyatlar.get(secim - 1) * kilo;
            System.out.println("Baska bir ürün satin almak istiyor musunuz:\n(Evet veya Hayir olarak giriniz)");
            alisVerisDevamMi = scanner.next();
            if (alisVerisDevamMi.equalsIgnoreCase("Evet")) {
                urunSecim();
            } else if (alisVerisDevamMi.equalsIgnoreCase("Hayir")) {
                System.out.println("Toplam ödeme tutariniz : " + toplamFiyat);
                System.exit(0);
            } else {
                System.out.println("Yanlis giris yaptiniz. Lütfen tekrar giriniz");
                urunSecim();
            }

        } catch (Exception e) { System.out.println("Yanlis giris yaptiniz. Secmek istediginiz ürünü tekrar giriniz");
            // Scanner'ı temizle
            scanner.next();
            urunSecim();
        }

    }
}
