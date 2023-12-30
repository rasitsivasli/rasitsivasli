package CodeChallenges.Projeler.FilmTahmin.BizimCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    static Scanner scan = new Scanner((System.in));
    static String userName;
    static String userParola;
    static ArrayList<String> userListe = new ArrayList<>(Arrays.asList("USER1", "USER2", "USER3"));
    static ArrayList<String> passwordListe = new ArrayList<>(Arrays.asList("USER01", "USER02", "USER03"));

    public static void userMenu() {
        System.out.println("Hesabiniz var mi?");
        String cevap = scan.next().toLowerCase().substring(0, 1);
        if (cevap.equals("e")) {
            System.out.println("Kullanici adi giriniz");
            userName = scan.next().toUpperCase();
            System.out.println("Kullanici sifresi giriniz");
            userParola = scan.next().toUpperCase();
            int nameIdex = User.userListe.indexOf(userName);
            int parolaIdex = User.passwordListe.indexOf(userParola);

            if (nameIdex == parolaIdex) {
                System.out.println("------Film Tahmin Oyununa Hoggeldiniz-------");
                System.out.println("Lütfen 0'dan " + FilmProje.filmListe.size() + " 'e kadar film numarasini giriniz");
                int filmNo = scan.nextInt();
                String secilenFilm=FilmProje.filmListe.get(filmNo).toUpperCase();
                System.out.println(secilenFilm);
                System.out.println("Sectiginiz film harf sayisi : "+secilenFilm.length());
                System.out.println(secilenFilm.length()*2+ " kadar deneme hakkiniz vardir.");

                int counter=0;
                for (int i = 0; i <secilenFilm.length()*2 ; i++) {
                    System.out.println("Lütfen film tahmininizi giriniz");
                    Scanner scanner=new Scanner(System.in);
                    String filmTahmini= scanner.nextLine().toUpperCase();
                    if (filmTahmini.equals((secilenFilm))){
                        System.out.println("Tebrikler "+i+1+". denemede dogru tahmin ettiniz");break;
                    }else {
                        System.out.println((secilenFilm.length()*2)-(i+1) +" hakkiniz kalmistir");
                    }
                }
            }
        } else {
            System.out.println("Lütfen hesap olusturun");
            kayitMenu();
        }
    }
    public static void kayitMenu() {
        System.out.println("Lütfen hesap olusturmak icin kullanici adinizi giriniz");
        String userName = scan.next();
        userListe.add(userName);
        System.out.println("Lütfen hesap olusturmak icin kullanici sifrenizi giriniz");
        String userParola = scan.next();
        passwordListe.add(userParola);
        System.out.println(passwordListe);
        System.out.println("Hesabiniz basariyla tamamlanmistir.Giris yapabilirsiniz");
        userMenu();
    }
}
