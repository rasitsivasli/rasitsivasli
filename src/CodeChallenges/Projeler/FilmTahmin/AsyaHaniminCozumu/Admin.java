package CodeChallenges.Projeler.FilmTahmin.AsyaHaniminCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    String c_RED    = "\u001B[31m";
    String BOLD     = "\033[0;1m";
    String c_RESET  = "\u001B[0m";
    String c_BLUE   = "\u001B[34m";
    String c_PURPLE = "\u001B[35m";
    String c_GREEN  = "\u001B[32m";
    private static String adminUser = "admin";
    private static String adminPassword = "admin01";

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> filmListe = new ArrayList<>(
            Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "GODFATHER","MATRIX", "BRAVEHEART",
                    "LEON", "GODFATHER", "JURASSICPARK", "TITANIC","HOBBITS","MISSIONIMPOSSIBLE","KINGKONG"));
    static ArrayList<String> userList = new ArrayList<>(Arrays.asList("user1","user2","user3","user4"));
    static ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("user01","user02","user03","user04"));




    public static void adminMenu() {

        System.out.println("Değerli Admin Hoşgeldiniz Yapamak İstediğiniz İşlemi Seçiniz:");
        System.out.println("**Filmler Listesini Ekleme Yapmak İçin:  1" +
                "\n**Filmler Listesinden Çıkarma Yapmak İçin:  2\n" +
                "\n**Kullanıcı Silmek İçin:  3"+
                "\n**Çıkış Yapmak İçin:  4");
        int adminSecim=scanner.nextInt();
        if(adminSecim==1){
            filmEkle();
        }
        else if(adminSecim==2){
            filmCikar();
        } else if (adminSecim==3) {
            userSil();
        }else {
            Film.menuGiris();
        }


    }

    public static void adminKontrol() {

        for (int i = 1; i <4 ; i++) {
            System.out.println("Lütfen Admin Kullanıcı Adınızı Giriniz");
            String adminName=scanner.next();
            System.out.println("Lütfen Admin Paralonızı Giriniz");
            String adminPass=scanner.next();
            if(adminName.equals(adminUser)&& adminPass.equals(adminPassword)){
                System.out.println("Giriş Başarılı");
                adminMenu();
                break;
            }
            System.out.println("Kalan deneme:"+(3-i));
            if(i==3){
                System.out.println("Deneme Hakkınız Bitti.Giriş Menüsüne Yönlendiriliyorsunuz...");
                Film.menuGiris();
            }

        }


    }

    private static void userSil() {
        System.out.println("***************Kullanıcı Çıkarma Menüsü***************");
        System.out.println(userList);
        System.out.println("Çıkarmak istediğiniz kullanıcı Adını giriniz giriniz:");
        String userName=scanner.next();
        for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).equalsIgnoreCase(userName)){
                userList.remove(i);
                passwordList.remove(i);
            }
        }
        System.out.println("Güncel Kullanınıcı Listeleri");
        System.out.println(userList);
        System.out.println(passwordList);
        Film.menuGiris();





    }

    private static ArrayList<String> filmCikar() {
        System.out.println("***************Film Çıkarma Menüsü***************");
        System.out.println(filmListe);
        System.out.println("Çıkarmak istediğiniz filmin numarasını giriniz:");
        int num=scanner.nextInt();
        filmListe.remove(num-1);
        System.out.println("Güncel Film Listesi:");
        System.out.println(filmListe);
        return filmListe;


    }

    private static ArrayList<String> filmEkle() {
        System.out.println("***************Film Ekle Menüsü***************");

        System.out.println(filmListe);
        System.out.println("Eklemek istediğiniz filmin Adını giriniz:");
        String  yeniFilm=scanner.next().toUpperCase();
        filmListe.add(yeniFilm);
        System.out.println("Güncel Film Listesi:");
        System.out.println(filmListe);
        return filmListe;
    }
}
