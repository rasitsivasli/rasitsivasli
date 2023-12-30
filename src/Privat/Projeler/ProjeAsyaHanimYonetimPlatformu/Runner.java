package Privat.Projeler.ProjeAsyaHanimYonetimPlatformu;

import java.util.HashMap;
import java.util.Scanner;

public class Runner {

    final static String c_RED = "\u001B[31m";
    final static String c_RESET = "\u001B[0m";
    final static String BOLD = "\033[0;1m";

    static HashMap<String, Ogrenci> ogrenciMap = new HashMap<String, Ogrenci>();
    static HashMap<String, Ogretmen> ogretmenMap = new HashMap<String, Ogretmen>();

    public static void main(String[] args) {

        anaMenu();
    }

    public static void anaMenu() {

        String secim;
        do {
            System.out.println(BOLD+c_RED+"""
                    ====================================
                     OGRENCI VE OGRETMEN YONETIM PANELI
                    ====================================
                         1- OGRENCI ISLEMLERI
                         2- OGRETMEN ISLEMLERI
                         Q- CIKIS
                    """+c_RESET);
            System.out.print(BOLD+"SECIMINIZ : ");

            Scanner scanner = new Scanner(System.in);
            secim = scanner.next().toUpperCase();
            switch (secim) {
                case "1":
                    OgrenciIslemler.islemler();
                    break;
                case "2":
                    OgretmenIslemler.islemler();
                    break;
                case "Q":
                    System.out.println("Cikis Yaptiniz");
                    System.exit(0);
                    break;
                default:
                    System.out.println(BOLD + c_RED + "Yanlis giris yaptiniz, tekrar deneyiniz" + c_RESET);

            }
        } while (!(secim.equals("1") || secim.equals("2")));
    }
}


