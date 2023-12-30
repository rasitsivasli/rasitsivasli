package CodeChallenges.Projeler.FilmTahmin.BizimCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilmProje {
  String userName;
  String userParola;
  String secim;
static Scanner scan= new Scanner (System.in);
  static ArrayList<String> filmListe = new ArrayList<>(
          Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "GODFATHER","MATRIX", "BRAVEHEART",
                  "LEON", "GODFATHER", "JURASSICPARK", "TITANIC","HOBBITS","MISSIONIMPOSSIBLE","KINGKONG"));
    public void filmMenu() {
      System.out.println("---Film Tahmin Oyununa Hosgeldiniz---\nAdmin girisi-1\nUser giris -2\nKayit olmak-3\nCikis-4");
       secim=scan.next();
       switch (secim){
         case "1": Admin.adminMenu();break;
         case "2": User.userMenu();break;
         case "3": User.kayitMenu();break;
         case "4": System.out.println("Cikis yaptiniz");
         default:
           System.out.println("Hatali giris yaptiniz");
       }
    }
  }

