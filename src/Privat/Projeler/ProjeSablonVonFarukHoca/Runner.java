package Privat.Projeler.ProjeSablonVonFarukHoca;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    static Map<Integer, Kisiler> liste = new HashMap<>();
    static int adresSonID=1;
    public static void main(String[] args) {
        // dosyan veriyi oku listeye al
        IslemKisiler.veriOku(); // aldık
        Scanner scanner = new Scanner(System.in);
        String secim;

        do {
            menu();
            secim = scanner.next().substring(0,1);
            switch (secim) {
                case "1": IslemKisiler.veriAdd();    break;
                case "2": IslemKisiler.veriDelete(); break;
                case "3": IslemKisiler.veriUpdate(); break;
                case "4": IslemKisiler.veriList();   break;
                case "5": IslemKisiler.veriListSilinmisler();   break;
                case "x","X":break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar giris yapiniz:");break;
            }

        }while (!secim.equalsIgnoreCase("x"));


    }
private static void menu() {
    System.out.println("""
            ==========PERSONEL MENUSUNE HOSGELDINIZ===========
            1. Veri Ekleme
            2. Veri Silme
            3. Veri Degistirme
            4. Veri Listeleme
            X. Cikis""");

}
}
