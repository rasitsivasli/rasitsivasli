package CodeChallenges.Projeler.ManavProjesi.Cozum1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manav {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<String> urunList = new ArrayList<>(Arrays.asList("Domates", "Biber", "Marul", "Roka", "Avakado"));
    int urunSecimi;
    int domatesFiyat;
    int biberFiyat;
    int marulFiyat;
    int rokaFiyat;
    int avakadoFiyat;
    String secim;
    int kilo;
    String tekrarAlmakIstermisiniz;
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     * 1. Adim : urun listesinden urun sectir ve kac kilo istediğini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     */


    public void urunSecimi() {
        System.out.println("Manavimiza hos geldiniz ");
        System.out.println("    Kilo/Fiyat\n" +
                " Domates :      30Tl\n" +
                " Biber   :      40Tl\n" +
                " Marul   :      20Tl\n" +
                " Roka    :      40Tl\n" +
                " Avakado :      30Tl");
        System.out.println("Lütfen almak istediginiz ürünü seciniz : \n1-Domates \n2-Biber \n3-Marul \n4-Roka \n5-Avakado");
        secim = "";
        do {
            urunSecimi = scanner.nextInt();
            System.out.println("Kac kilo "+urunList.get(urunSecimi-1)+" almak istersiniz");
            kilo=scanner.nextInt();
            System.out.println("Baska bir ürün almak istermisiniz. \n(Evet veya Hayir olarak giris yapiniz) :");
            tekrarAlmakIstermisiniz=scanner.next();
            if (tekrarAlmakIstermisiniz.equalsIgnoreCase("Evet")){
                urunSecimi();
            } else if (tekrarAlmakIstermisiniz.equalsIgnoreCase("Hayir")) {
                break;
            }else {
                System.out.println("Hatali giris yaptiniz tekrar secimyapiniz");
                urunSecimi();
            }

        } while (secim != "6");

    }

}


