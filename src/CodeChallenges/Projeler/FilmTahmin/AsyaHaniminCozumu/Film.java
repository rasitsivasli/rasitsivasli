package CodeChallenges.Projeler.FilmTahmin.AsyaHaniminCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Film {
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_RESET = "\u001B[0m";
    static String c_BLUE = "\u001B[34m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";

    static void menuGiris() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Film Tahmin Oyunumuza Hoşgeldiniz:" +
                "\nLütfen  giriş yapınız." +
                "\nAdmin girişi için - 1" +
                "\nKullanıcı girişi için - 2" +
                "\nKayıt olamak için - 3" +
                "\nÇıkış için - 4" +
                "\nSeçiniz : ");
        int sec = scanner.nextInt();// seçim alındı
        if (sec == 1) {
            Admin.adminKontrol();
        }
        else if(sec== 2){
            User.userKontrol();
        }else if(sec==3){
            User.userKayit();
        }else if(sec==4){
            System.out.println("Çıkış işlemi gerçekleştiriliyor...");
        }else {
            System.out.println("Hatalı Giriş Yaptınız.Lütfen Tekrar deneyin");
            menuGiris();
        }

    }
}







