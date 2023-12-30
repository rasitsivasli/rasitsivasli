package CodeChallenges.Projeler.FilmTahmin.AsyaHaniminCozumu;

import java.util.Scanner;

import static CodeChallenges.Projeler.FilmTahmin.AsyaHaniminCozumu.Admin.*;

public class User {
    static Scanner scanner = new Scanner(System.in);

    private String userName;
    private String userPassword;


    public static void userKontrol() {
        System.out.println("************Kullanıcı Menüsüne Hoşgeldiniz*************");

        for (int i = 1; i < 4; i++) {
            System.out.println("Lütfen  Kullanıcı Adınızı Giriniz");
            String user = scanner.next();
            System.out.println("Lütfen Paralonızı Giriniz");
            String userPass = scanner.next();
            for (int j = 0; j < userList.size(); j++) {//
                if (userList.get(j).contains(user) && passwordList.get(j).equals(userPass)) {
                    System.out.println("Giriş Başarılı:");
                   i=4;

                    break;
                }

            }//
            if(i==4){
                filmTahmin();
                break;
            }
            System.out.println("Kalan deneme Hakkınız:"+(3-i));

            if (i == 3 ) {
                System.out.println("Deneme Hakkınız Bitti.Giriş Menüsüne Yönlendiriliyorsunuz...");
                Film.menuGiris();
            }


        }
    }

     static void filmTahmin() {
        System.out.println("Listemizde bulunan "+filmListe.size()+" filmden birini seçmek için");;
        System.out.print("1 ile " +filmListe.size() + " arasında bir sayı giriniz: ");
        int filmIndex = scanner.nextInt();
        scanner.nextLine();
        String tahminEdilecekFilm = filmListe.get(filmIndex-1);
        int tahminHakki = tahminEdilecekFilm.length() * 2;
        System.out.println("\n"+tahminHakki+" defa tahmin hakkınız bulunmaktadır.");
        String ipucuFilm = tahminEdilecekFilm.substring(2);
        ipucuFilm = tahminEdilecekFilm.substring(0,2) + ipucuFilm.replaceAll("\\D","*");
        System.out.println("Filmi tahmin etmen için sana bir ipucu veriyorum -->" + ipucuFilm);
        int sayac =0;
        while (tahminHakki > 0) {
            sayac++;
            System.out.print("\n"+sayac +". tahminini gir: ");
            String tahmin = scanner.nextLine().toUpperCase();
            tahmin = tahmin.replaceAll(" ","");

            if (tahmin.equalsIgnoreCase(tahminEdilecekFilm)) {
                System.out.println("\nTebrikler! "+ sayac+". tahmin hakkınızda filmi bildiniz. ");
                break;
            }
            else System.out.println("\nMalasef bilemediniz. "+"\n"+ ((tahminEdilecekFilm.length()*2)-sayac) + " tane hakkınız kaldı. Devamkeee :) ");

            tahminHakki--;

        }
        if (tahminHakki == 0) System.out.println("\nMalasef Kaybettiniz :( ");
        Film.menuGiris();

    }

    public static void userKayit() {
        System.out.println("**********Kayıt Menüsüne Hoşgeldiniz******************");
        System.out.println("Kullanıcı Adınızı Giriniz");
        String yeniUser=scanner.next();
        userList.add(yeniUser);
        System.out.println("Kullanıcı Şifrenizi Belirleyiniz.5 karakterden oluşmalı:");
        String yeniUserPass=scanner.next();
        passwordList.add(yeniUserPass);
        Film.menuGiris();

    }
}


