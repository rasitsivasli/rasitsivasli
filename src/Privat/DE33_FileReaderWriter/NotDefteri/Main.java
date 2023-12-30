 package Privat.DE33_FileReaderWriter.NotDefteri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kayit> liste = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        VeriOkuYaz.verioku();
        String secim="";
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            secim = scanner.next().substring(0,1).toLowerCase();
            switch (secim) {
                case "1" : veriEkle(); break;
                case "2" : veriSil(); break;
                case "3" : veriListele(); break;
                case "4" : veriGuncelle(); break;
                case "x" : break;
                default:
                    System.out.println("hatalı seçim tekrar şeiniz");
            }

        } while (!secim.equals("x"));
        System.out.println("Program sonlandı ");
    }

    private static void veriGuncelle() {
    }


    private static void veriListele() {
        System.out.println("Veri Listesi");
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(liste.get(i));
        }
    }

    private static void veriSil() {
        System.out.println("veri silindi");
    }

    private static void veriEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No yu giriniz : ");
        int no = scanner.nextInt();
        System.out.print("Not u giriniz : ");
        String not = scanner.next();
        // id = liste.getLast.getID + 1;
        // Kayit kayit = new Kayit(id,no,not);
        Kayit kayit = new Kayit(no,not);
        liste.add(kayit);
        VeriOkuYaz.veriyaz();
    }

    private static void menu() {
        System.out.println("\n\n\n ISLEM MENUSU");
        System.out.println(" 1 : veri ekle" );
        System.out.println(" 2 : veri sil" );
        System.out.println(" 3 : veriliste" );
        System.out.println(" x : Çıkış " );
        System.out.print("Seciminiz .... : ");
    }
}
