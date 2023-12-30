package CodeChallenges.Projeler.ManavProjesi.Manav_YasinBeinCozumu3;

import java.util.Scanner;

public class ManavRunner2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String secim;
        double ucret;
        double toplamKilo=0;
        Manav2 domates = new Manav2();
        Manav2 biber = new Manav2();
        Manav2 marul = new Manav2();
        Manav2 roka = new Manav2();
        Manav2 avakado = new Manav2();
        ucret=0;
        monu();
        do {
            System.out.println("Almak istediginiz urunu seciniz:");
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    domates.sec(domates.domatesFiyat);ucret+=domates.toplamUcret;
                    toplamKilo+= domates.toplamKilo;
                    break;
                }
                case "2": {
                    biber.sec(biber.biberFiyat);ucret+=biber.toplamUcret;toplamKilo+= biber.toplamKilo;
                    break;
                }
                case "3": {
                    marul.sec(marul.marulFiyat);ucret+=marul.toplamUcret;toplamKilo+= marul.toplamKilo;
                    break;
                }
                case "4": {
                    roka.sec(roka.rokaFiyat);ucret+=roka.toplamUcret;toplamKilo+= roka.toplamKilo;
                    break;
                }
                case "5": {
                    avakado.sec(avakado.avakadoFiyat);ucret+=avakado.toplamUcret;toplamKilo+= avakado.toplamKilo;
                    break;
                }
                case "6": {
                    System.out.println("Gene bekleriz.");
                    break;
                }
                default:
                    System.out.println("Hatali giris yaptiniz.Tekrar giriniz.");
            }
        }while (!secim.equalsIgnoreCase("6")) ;
        System.out.println("         \t Kilo\t==\tFiyat\n" +
                " 1. Domates : " +domates.toplamKilo+"\t==\t"+domates.toplamUcret+
                "\n 2. Biber   : " +biber.toplamKilo+"\t==\t"+biber.toplamUcret+
                "\n 3. Marul   : " +marul.toplamKilo+"\t==\t"+marul.toplamUcret+
                "\n 4. Roka    : " +roka.toplamKilo+"\t==\t"+roka.toplamUcret+
                "\n 5. Avakado : " +avakado.toplamKilo+"\t==\t"+avakado.toplamUcret+
                "\n    Toplam Fiyat: "+ucret+" TL"+
                "\n    Toplan Kilo : "+toplamKilo+" kg");
    }



    private static void monu() {
        System.out.println("            Kilo/Fiyat\n" +
                " 1. Domates :      30Tl\n" +
                " 2. Biber   :      40Tl\n" +
                " 3. Marul   :      20Tl\n" +
                " 4. Roka    :      40Tl\n" +
                " 5. Avakado :      30Tl\n" +
                " 6. Cikis");
    }
}