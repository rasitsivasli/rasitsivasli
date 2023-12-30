package CodeChallenges.Projeler.ManavProjesi.Manav_YasinBeinCozumu3;

import java.util.Scanner;

public class Manav2 {
    static Scanner scanner = new Scanner(System.in);
    int domatesFiyat = 30;
    int biberFiyat = 40;
    int marulFiyat = 20;
    int rokaFiyat = 30;
    int avakadoFiyat = 30;
    String secim;
    double kilo;
    double ucret;
    double toplamUcret;
    double toplamKilo;




public void sec(double fiyat) {
    System.out.println("Kac kilo almak istiyorsunuz?");
    kilo = scanner.nextDouble();
    ucret = kilo * fiyat;
    toplamKilo+=kilo;
    toplamUcret += ucret;
}

    @Override
    public String toString() {
        return "Manav1{" +
                "domatesFiyat=" + domatesFiyat +
                ", biberFiyat=" + biberFiyat +
                ", marulFiyat=" + marulFiyat +
                ", rokaFiyat=" + rokaFiyat +
                ", avakadoFiyat=" + avakadoFiyat +
                ", secim='" + secim + '\'' +
                ", kilo=" + kilo +
                ", ucret=" + ucret +
                ", toplamUcret=" + toplamUcret +
                '}';
    }
}
