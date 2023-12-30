package CodeChallenges.Projeler.FilmTahmin.BizimCozum;

import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    static Scanner scan = new Scanner((System.in));
    static String adminName = "admin";
    static String adminParola = "admin01";

    public static void adminMenu() {
        int counter = 0;
        do {
            counter++;
            System.out.println("Admin adi giriniz");
            String adminIsim = scan.next();
            System.out.println("Admin sifresi giriniz");
            String adminSifre = scan.next();
            if (adminSifre.equalsIgnoreCase(adminParola) && adminIsim.equalsIgnoreCase(adminName)) {
                System.out.println("Admin hesabiniza giris yaptiniz ");
                adminYetkileri();
                break;

            } else {
                System.out.println("Hatali giris yaptiniz. " + (3 - counter) + " deneme hakkiniz kalmistir.");
            }
        } while (counter < 3);

    }

    public static void adminYetkileri() {
        System.out.println("Film listesine film eklemek-1\nFilm Listesinden film silmek -2\nKullanici silmek-3");
        String adminSecim = scan.next();
        System.out.println("Seciminiz : " + adminSecim);

        if (adminSecim.equalsIgnoreCase("1")) {
            System.out.println("Lütfen eklemek istediginiz filmin adini yaziniz");
            System.out.println(FilmProje.filmListe);
            String filmAdi = scan.next().toUpperCase();

            if (!FilmProje.filmListe.contains(filmAdi)) {
                FilmProje.filmListe.add(filmAdi);
                System.out.println("Isteginiz film : '" + filmAdi + "' listeye eklendi");
            }
            System.out.println(FilmProje.filmListe);
            System.out.println("Menuye devam etmek istiyor musunuz? Evet yada Hayir seklinde cevaplayiniz.");
            String cevap = scan.next().toLowerCase().substring(0, 1);
            if (cevap.equals("e")) {
                adminYetkileri();
            } else if (cevap.equals("h")) {
                System.out.println("Isleminiz tamamlanmistir.");
            } else {
                System.out.println("Hatali giris yaptiniz.Lütfen tekrar deneyin.");
                adminYetkileri();
            }

        } else if (adminSecim.equalsIgnoreCase("2")) {
            System.out.println("Lütfen silmek istediginiz filmin adini yaziniz");
            String filmSil = scan.next().toUpperCase();
            if (FilmProje.filmListe.contains(filmSil)) {
                FilmProje.filmListe.add(filmSil);
                FilmProje.filmListe.remove(filmSil);
                System.out.println(FilmProje.filmListe);
                System.out.println("Isteginiz film : '" + filmSil + "' listeden silindi");
            } else {
                System.out.println("Girdiginiz film '" + filmSil + "' film listesinde yok. Lütfen yeniden deneyin");}
                System.out.println("Menuye devam etmek istiyor musunuz? Evet yada Hayir seklinde cevaplayiniz.");
                String cevap = scan.next().toLowerCase().substring(0, 1);
                if (cevap.equals("e")) {
                    adminYetkileri();
                } else if (cevap.equals("h")) {
                    System.out.println("Isleminiz tamamlanmistir.");
                } else {
                    System.out.println("Hatali giris yaptiniz.Lütfen tekrar deneyin.");
                    adminYetkileri();
                }

            } else if (adminSecim.equalsIgnoreCase("3")) {
                System.out.println("Lütfen silmek istediginiz kullaniciyi yaziniz");
                String userSil = scan.next().toUpperCase();
                int idex = User.userListe.indexOf(userSil);
                User.userListe.remove(userSil);
                User.passwordListe.remove(idex);
                System.out.println("Silmek istediginiz kullanici " + userSil + " silindi.");
                System.out.println(User.userListe);
                System.out.println("Menuye devam etmek istiyor musunuz? Evet yada Hayir seklinde cevaplayiniz.");
                String cevap = scan.next().toLowerCase().substring(0, 1);
                if (cevap.equals("e")) {
                    adminYetkileri();
                } else if (cevap.equals("h")) {
                    System.out.println("Isleminiz tamamlanmistir.");
                } else {
                    System.out.println("Hatali giris yaptiniz.Lütfen tekrar deneyin.");
                    adminYetkileri();
                }

            } else {
                System.out.println("Hatali giris yaptiniz");
                adminYetkileri();
            }
        }
    }
