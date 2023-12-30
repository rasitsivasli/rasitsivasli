package Privat.DE31_Maps.MapProje;

import java.io.*;
import java.util.ArrayList;

public class FileHelper implements InterFile {
    final static String filePath=System.getProperty("user.dir")+"/dosya1.txt";
    @Override
    public void dosyayaYaz(ArrayList<Adres> liste) {
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter fWriter = new FileWriter(file,false);
            //  FileWriter fWriter = new FileWriter(file,true) eski veriler gitmesin istersek boyle olur
            // apand false ise dosyadaki önceki verileri siler
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            for (int i = 0; i < Runner.liste.size() ; i++) {
                // line olustur
                String line="";
                bWriter.write(line);  // ekleme yapıyorsak bWriter.append(str1)
                bWriter.newLine();
            }

            bWriter.close();
            fWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }

        // listeyi dosyaya yaz
    }

    @Override
    public ArrayList<Adres> dosyadanOku() {
        ArrayList<Adres> liste = new ArrayList<>();
        // dosyadan oku, listeye aktar

        // dosyayı açalım
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;
            while ((line=bReader.readLine()) !=null){
                // System.out.println(line);
                // line parçala, dizi ye al


                // Kisiler kayit = new Kisiler(,,,,);
              //  Runner.liste.add(kayit);

            }
            bReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }




        // listenin son elemanının  ID sini  Runner.adresSonID ye alalım
        return liste;
    }
}
