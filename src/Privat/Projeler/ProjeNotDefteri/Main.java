package Privat.Projeler.ProjeNotDefteri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kayit> liste = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        VeriOkuYaz.veriOku();
        String secim = "";

        do {
            menu();
            secim = scanner.next().substring(0, 1).toLowerCase();
            switch (secim) {
                case "1":
                    veriEkle();
                    break;
                case "2":
                    veriSil();
                    break;
                case "3":
                    veriListele();
                    break;
                case "x":
                    System.out.println("Cikis yapildi");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz, tekrar giriniz");
            }
        } while (!secim.equals("x"));


    }

    private static void veriListele() {
        System.out.println("Veri listesi : ");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }

    private static void veriSil()  {
        System.out.println("Hangi kaydi silmek istiyorsunuz");
        int silme = scanner.nextInt();
        for (int i = 0; i < liste.size(); i++) {
        if (liste.get(silme)==liste.get(i)) {
            liste.remove(liste.get(i));
            }
        }
    }

    private static void veriEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No yu giriniz : ");
        int no = scanner.nextInt();
        System.out.print("Not u giriniz : ");
        String not = scanner.next();
        Kayit kayit = new Kayit(no, not);
        liste.add(kayit);
        VeriOkuYaz.veriYaz();
    }

    private static void menu() {
        System.out.println("\n\n\nISLEM MENUSU");
        System.out.println("1 : veri ekle");
        System.out.println("2 : veri sil");
        System.out.println("3 : veri liste");
        System.out.println("x : cikis");
        System.out.print("Seciminiz : ");

    }
}
