package Privat.DE31_Maps.MapProje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

    static Map<Integer,Adres> liste = new HashMap<>();
    static int adresSonID=1;
    public static void main(String[] args) {
        // dosyan veriyi oku listeye al
        Islemler.veriList();
        System.out.println("Yapmak istediginiz secimi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String secim;

        do {
            menu();
            secim = scanner.next().substring(0,1);
            switch (secim) {
                case "1": Islemler.veriAdd();break;
                case "2": Islemler.veriDelete();break;
                case "3": Islemler.veriUpdate();break;
                case "4": Islemler.veriList();break;
                case "x","X" :break;
                default: System.out.println("Hatali giris yaptiniz. Tekrar giris yapiniz:");break;
            }

        }while (!secim.equalsIgnoreCase("x")) ;
    }



    private static void menu() {
        System.out.println("""
            ==========PERSONEL MENUSUNE HOSGELDINIZ===========
            1. Veri Ekleme
            2. Veri Silme
            3. Veri Degistirme
            4. Veri Listeleme
            5. Cikis""");


    }
}
