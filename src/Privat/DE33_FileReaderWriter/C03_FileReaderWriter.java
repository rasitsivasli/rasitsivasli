package Privat.DE33_FileReaderWriter;

import java.io.*;

public class C03_FileReaderWriter {
    public static void main(String[] args) {
        // dosyanın path i belirlenmeli , yerini

        String filePath=System.getProperty("user.dir")+"/dosya1.txt";

        String str1="dosyaya veri yazalım2";
        String str2="dosyaya bir veri daha yazalım2";
//        str1=String.format("%30s",str1);
//        str2=String.format("%30s",str2);

        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // dosyaya veriyi yazalım
        try {
            // eğer dosyayı sıfırlatmayıp eskinin üstüne yazacaksam FileWriter da append:true olmalı

            FileWriter fWriter = new FileWriter(file,false);
          //  FileWriter fWriter = new FileWriter(file,true) eski veriler gitmesin istersek boyle olur
            // apand false ise dosyadaki önceki verileri siler
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(str1);  // ekleme yapıyorsak bWriter.append(str1)
            bWriter.newLine(); // alt satıra geçsin diye
            bWriter.write(str2);
            bWriter.newLine();
            bWriter.close();
            fWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;
            while ((line=bReader.readLine()) !=null){
                System.out.println(line);
            }
            bReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        // dikkat file ve buffer close yapılmadan bu çalışırsa silmez
        //   if (file.exists()) file.delete(); // dosya silme
    }
}
