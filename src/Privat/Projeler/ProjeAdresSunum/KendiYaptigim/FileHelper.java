package Privat.Projeler.ProjeAdresSunum.KendiYaptigim;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper implements InterFile {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Kisiler> liste = new ArrayList<>();
    String filePath = "C:\\Users\\sivas\\OneDrive\\Masaüstü\\Proje/TelefonDefteri.txt"; // dosya yolu
    String filePathSilinenler = "C:\\Users\\sivas\\OneDrive\\Masaüstü\\Proje/silinenKisiler.txt"; //Silinenler icin dosya yolu
    File file = new File(filePath);
    Kisiler kisi = new Kisiler();
    int sonID = -1;//Bir sonraki veri girisinde artmasi icin ve 222. satirda veri yoksa icin kullaniyorum
    final static String c_BLACK = "\u001B[30m";
    final static String c_RED = "\u001B[31m";
    final static String c_GREEN = "\u001B[32m";
    final static String c_YELLOW = "\u001B[33m";
    final static String c_BLUE = "\u001B[34m";
    final static String c_PURPLE = "\u001B[35m";
    final static String c_CYAN = "\u001B[36m";
    final static String c_WHITE = "\u001B[37m";
    final static String c_RESET = "\u001B[0m";
    final static String BOLD = "\033[0;1m";
    final static String ITALIC = "\033[3m";
    final static String nITALIC = "\033[0m";

    public void menu() throws IOException {
        veriOku();

        System.out.print(c_RESET + BOLD + """
                \n\t\t\tMenu:
                1- Rehbere yeni kisi ekleme.
                2- Telefon Rehberindeki kayitli kisiler.
                3- Kayitli kisilerden silme.
                4- Daha önce sildiginiz kayitlar.
                0- Cikis\s
                Seciminiz :\s""");

        String secim = scanner.next();
        switch (secim) {
            case "1":
                veriYaz();
                break;
            case "2":
                tumRehberiOku();
                break;
            case "3":
                veriSil();
                break;
            case "4":
                silinenleriGor();
                break;
            case "0":
                System.out.println("Cikis yaptiniz");
                System.exit(0);
            default:
                System.out.println("Yanlis giris yaptiniz, tekrar deneyiniz");
                menu();
        }


    }

    private void silinenleriGor() throws IOException {
        System.out.println();
        System.out.println(BOLD + c_RED + "Rehberden daha önce sildiginiz kayitlar\n" + c_RESET);

        File fileSilinenler = new File(filePathSilinenler); // File nesnesi oluşturuldu
        if (!fileSilinenler.exists()) {
            System.out.println(BOLD+c_BLUE+"Silinmis kisi bulunamadi.\n"+c_RESET);
        } else {
            FileReader fReaderSilinenler = new FileReader(fileSilinenler);
            BufferedReader bReaderSilinenler = new BufferedReader(fReaderSilinenler);
            String lineSilinenler = "";

            while ((lineSilinenler = bReaderSilinenler.readLine()) != null) {
                System.out.println(lineSilinenler);
            }

            bReaderSilinenler.close();
            fReaderSilinenler.close();
        }

        menu();
    }

    private void veriSil() throws IOException {
        if (!file.exists()) {
            System.out.println("Dosya bulunamadı.");
            menu();
        }

        // Dosyadan veriyi okuyup geçici bir listeye attik
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        ArrayList<String> geciciListe = new ArrayList<>();// gecici liste icin ArrayList
        String line;

        while ((line = bReader.readLine()) != null) {// satir bos olmadigi sürece okuyacak
            geciciListe.add(line);// ve gecici listeye gönderecek
        }

        bReader.close();
        fReader.close();

        // Silmek istediğim kişinin ismini aliyorum:
        System.out.print(BOLD + c_BLUE + "Silmek istediğiniz kisinin ismini giriniz: " + c_RESET);
        String isimSil = scanner.next();

        // Dosyayı sıfırla ve tüm satırları tekrar yaz
        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        //Silinenler icin yeni text dosyasi
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Dosyayı sıfırla ve tüm satırları tekrar yaz
        FileWriter fWriterSilinenler = new FileWriter(filePathSilinenler, true);
        BufferedWriter bufferedWriterSilinenler = new BufferedWriter(fWriterSilinenler);

        for (String eleman : geciciListe) {
            // Isme sahip olan satırı sil
            if (!eleman.contains(isimSil)) {
                bWriter.write(eleman);
                bWriter.newLine();
            } else {
                // Silinenler için yeni text dosyası
                bufferedWriterSilinenler.write(eleman);
                bufferedWriterSilinenler.newLine();
            }
        }

        System.out.println(BOLD+c_GREEN+"\nKisi silindi.\n"+c_RESET);
        bufferedWriterSilinenler.close();
        bWriter.close();
        fWriter.close();

        menu();
    }

    private void tumRehberiOku() throws IOException {
        System.out.println();
        System.out.println(BOLD + c_RED + "Rehberde Kayitli tüm Kisiler\n" + c_RESET);
        if (!file.exists()){
            System.out.println("Su an rehberinizde kayitli kisi yoktur.");
        }
        File file = new File(filePath);
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line = "";

        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }

        bReader.close();
        fReader.close();
        menu();
    }


    @Override
    public void veriYaz() throws IOException {
        if (!file.exists()) file.createNewFile();// Eger böyle bir dosya yoksa creat edecek
        FileWriter fWriter = new FileWriter(file, true);// yazma metodu, true üzerine yazmayi sagliyor
        BufferedWriter bWriter = new BufferedWriter(fWriter);// yazma islemini daha hizli gerceklestirmek icin, istege baglidir
        System.out.print("Telefon rehberinize eklemek istediginiz kisi sayisini giriniz : ");
        String kisiSayisi;
        boolean kisiSayisiGirisDogruMu = true;
        do {
            kisiSayisi = scanner.next();
            if (Character.isDigit(kisiSayisi.charAt(0))) {
                for (int i = 0; i < Integer.parseInt(kisiSayisi); i++) {
                    kisi.setID(sonID + 1);
                    sonID++;// Bir sonraki veri girisi icin ID arttiriliyor
                    System.out.println("Eklenecek kisinin ID si = " + kisi.getID());
                    System.out.print("Ad giriniz : ");
                    String ad = scanner.next();
                    kisi.setAd(ad);
                    System.out.print("Soyad giriniz : ");
                    String soyAd = scanner.next();
                    kisi.setSoyad(soyAd);
                    telefonKontrol();
                    eMailKontrol();
                    System.out.print("Kisiler giriniz : ");
                    kisi.setAdres(scanner.next());
                    System.out.print("Statu giriniz : ");
                    kisi.setStatu(scanner.nextBoolean());


                    bWriter.write(kisi.toString());//Burada kisiyi text e yazdiriyoruz
                    bWriter.newLine();// yeni bir satira gecmeyi saglar
                    liste.add(kisi);// Olusturdugumuz kisileri listeye ekliyoruz
                }
                kisiSayisiGirisDogruMu = false;
            } else System.out.print("Yanlis giris yaptiniz, eklenecek kisi sayisini tekrar giriniz : ");


        } while (kisiSayisiGirisDogruMu);

        bWriter.write("SonId= " + kisi.getID());//Son ID yi buradan aliyoruz
        bWriter.newLine();
        bWriter.close();
        menu();
    }

    @Override// S0N ID yi buradan aliyoruz
    public void veriOku() throws IOException {
        if (!file.exists()) file.createNewFile();// Eger böyle bir dosya yoksa creat edecek
        File file = new File(filePath);
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line = "";

        while ((line = bReader.readLine()) != null) {
            if (line.startsWith("SonId=")) {
                // SonId ile başlayan satır
                String sonIdStr = line.substring(6).trim(); // "SonId=" kısmını çıkar, boşlukları temizle
                sonID = Integer.parseInt(sonIdStr);
            }
        }
        if (sonID != -1) {
            System.out.println(BOLD + c_RED + "Rehberde silinenler kisiler dahil kullanilmis ID sayisi : " + (sonID + 1));

        } else {
            System.out.println(BOLD + c_RED + "Telefon rehberinizde su an icin kayitli kimse bulunamadi");
        }
        bReader.close();
        fReader.close();


    }

    private void telefonKontrol() {
        String tel;
        boolean telDogrumu = true;
        do {
            System.out.print(BOLD+c_BLUE + "Telefon numaranizi giriniz(Almanya icin +49) : " + c_RESET);
            tel = scanner.next();
            if (tel.startsWith("+49")) {
                if (tel.length() == 13) {
                    if (tel.substring(1).replaceAll("\\D", "").length() == 12) {
                        kisi.setTel(tel);
                        telDogrumu = false;
                    } else {
                        System.out.println(BOLD+c_BLUE + "Telefon numaraniz rakamlar disinda karakterler icermemeli" + c_RESET);
                    }
                    // rakamlar disindaki hersey silindiginde uzunluk 12 olmali
                } else {
                    System.out.println(BOLD+c_BLUE + "Telefon numaraniz '+' haric 12 karakter icermeli" + c_RESET);
                }
            } else {
                System.out.println(BOLD+c_BLUE + "Telefon numaranizi yanlis girdiniz. Lütfen tekrar deneyiniz" + c_RESET);
            }

        } while (telDogrumu);
    }

    private void eMailKontrol() {
        String eMail;
        boolean eMailDogrumu = true;
        do {
            System.out.print(BOLD+c_RED + "EMail adresinizi giriniz : ");
            eMail = scanner.next();
            if (Character.isLetter(eMail.charAt(0))) {
                if (eMail.contains("@")) {
                    if (eMail.endsWith("gmail.com") || eMail.endsWith("gmx.com")) {
                        kisi.seteMail(eMail);
                        eMailDogrumu = false;
                    } else {
                        System.out.println("Email adresiniz gmail.com yada gmx.com ile bitmelidir");
                    }
                    // rakamlar disindaki hersey silindiginde uzunluk 12 olmali
                } else {
                    System.out.println("EMail adresiniz '@' karakteri icermelidir ");
                }
            } else {
                System.out.println("EMail adresiniz harfle baslamali ");
            }

        } while (eMailDogrumu);
    }
}



