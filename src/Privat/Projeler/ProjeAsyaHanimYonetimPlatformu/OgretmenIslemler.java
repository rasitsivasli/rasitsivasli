package Privat.Projeler.ProjeAsyaHanimYonetimPlatformu;

import java.util.Map;
import java.util.Scanner;

public class OgretmenIslemler {
    public static void islemler() {
        System.out.print(""" 
                ============= ISLEMLER =============
                1-EKLEME
                2-ARAMA
                3-LISTELEME
                4-SILME
                5-ANA MENU
                Q-CIKIS
                       """);
        System.out.print("SECIMINIZ : ");
        Scanner scanner = new Scanner(System.in);
        String secim = scanner.next();
        switch (secim) {
            case "1":
                veriEkle();
                break;
            case "2":
                veriArama();
                break;
            case "3":
                veriListele();
                break;
            case "4":
                veriSilme();
                break;
            case "5":
                Runner.anaMenu();
                break;
            case "Q":
                System.out.println("Cikis yaptiniz");
                System.exit(0);
            default:
                System.out.println("Yanlis giris yaptiniz, tekrar deneyiniz");
                islemler();

        }


    }

    public static void veriEkle() {
        Scanner scannerNl = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String adSoyad = scannerNl.nextLine();
        System.out.print("Kimlik Numaranizi giriniz : ");
        String kimlikNo = scanner.next();
        System.out.print("Yasinizi giriniz : ");
        int yas = scanner.nextInt();
        System.out.print("Bolumunuzu giriniz : ");
        String bolum = scanner.next();
        System.out.print("Sicil numaranizi giriniz : ");
        String sicilNo = scanner.next();
        Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);// map icine atmak icin ögrenci kisisi olusturuldu
        Runner.ogretmenMap.put(sicilNo, ogretmen);
        islemler();
    }

    public static void veriArama() {
        Scanner scanner = new Scanner(System.in);
        if (Runner.ogretmenMap.isEmpty()) {
            System.out.println("Aranan ogretmen bulunamadi, Lutfen tekrar giriniz");
        }else{System.out.print("Bilgilerine ulasmak istediginiz ogretmenin numarasini giriniz  : ");
            String arananSicilNo = scanner.next();
            for (Map.Entry<String, Ogretmen> val : Runner.ogretmenMap.entrySet()) {
                if (val.getValue().getSicilNo().equals(arananSicilNo)) {
                    System.out.println(val.getValue());
                }
            }
        }
        islemler();

    }

    public static void veriListele() {

        if (Runner.ogretmenMap.isEmpty()) {
            System.out.println("Listede kayitli ogretmen yoktur");
        } else {
            for (Map.Entry<String, Ogretmen> entry : Runner.ogretmenMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
        islemler();
    }

    public static void veriSilme() {
        Scanner scanner = new Scanner(System.in);

        if (Runner.ogretmenMap.isEmpty()) {
            System.out.println("Listede kayitli ogretmen yoktur");
        }else {
            System.out.print("Silmek istediginiz ogrencinin numarasini giriniz  : ");
            String silinecekOgrenciNumara = scanner.next();
            for (Map.Entry<String, Ogretmen> entry : Runner.ogretmenMap.entrySet()) {
                if (entry.getValue().getSicilNo().equals(silinecekOgrenciNumara)) {
                    Runner.ogretmenMap.remove(entry.getKey());
                    System.out.println("Ogretmen bilgileri basariyla silinmistir");
                    break;
                }
            }
        }
        islemler();
    }
}
