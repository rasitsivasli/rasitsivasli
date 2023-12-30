package Privat.Projeler.ProjeAsyaHanimYonetimPlatformu;


import java.util.Map;
import java.util.Scanner;

public class OgrenciIslemler {

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
        System.out.print("Ogrenci numaranizi giriniz : ");
        String ogrenciNo = scanner.next();
        System.out.print("Sinifinizi giriniz : ");
        String ogrenciSinif = scanner.next();
        Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, ogrenciSinif);// map icine atmak icin ögrenci kisisi olusturuldu
        Runner.ogrenciMap.put(ogrenciNo, ogrenci);
        islemler();
    }

    public static void veriArama() {
        Scanner scanner = new Scanner(System.in);
        if (Runner.ogrenciMap.isEmpty()) {
            System.out.println("Listede ögrenci yoktur, Lutfen tekrar giriniz");
        } else {
            System.out.print("Bilgilerine ulasmak istediginiz ogrencinin numarasini giriniz  : ");
            String arananNumara = scanner.next();
            for (Map.Entry<String, Ogrenci> entry : Runner.ogrenciMap.entrySet()) {
                if (entry.getValue().getOgrenciNo().equals(arananNumara)) {
                    System.out.println(entry.getValue());
                }
            }
        }
        islemler();
    }

    public static void veriListele() {
        if (Runner.ogrenciMap.isEmpty()) {
            System.out.println("Listede kayitli ogrenci yoktur");
        } else {
            for (Map.Entry<String, Ogrenci> entry : Runner.ogrenciMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
        islemler();
    }

    public static void veriSilme() {
        Scanner scanner = new Scanner(System.in);
        if (Runner.ogrenciMap.isEmpty()) {
            System.out.println("Listede kayitli ogrenci yoktur");
        } else {
            System.out.print("Silmek istediginiz ogrencinin numarasini giriniz  : ");
            String silinecekOgrenciNumara = scanner.next();

            // Burasi contains ile for olmadan tek ifle yapilabilir
            for (Map.Entry<String, Ogrenci> entry : Runner.ogrenciMap.entrySet()) {
                if (entry.getValue().getOgrenciNo().equals(silinecekOgrenciNumara)) {
                    Runner.ogrenciMap.remove(entry.getKey());
                    System.out.println("Ogrenci bilgileri basariyla silinmistir");break;
                }
            }
        }
        islemler();
    }
}
