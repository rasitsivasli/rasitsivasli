package SerbetCalismalar.FileClass;

import java.io.*;
import java.time.LocalDate;

public class Beispiel_Selbst {
    public static void main(String[] args) {
        // Ders notlarini tuttugumuz bir file yapalim, gün ve not

        String filePath= System.getProperty("user.dir)"+"/dosya1.txt");

        LocalDate gun = LocalDate.now();
        String gunStr = String.valueOf(gun);
        int not = 90;
        String notStr = String.valueOf(not);
        /*str1=String.format("%30s",str1); // kodlari formatlamak icin yaptik
        str1=String.format("%30s",str2);
*/
        File file = new File(filePath); // dosya obj. sini path+isim ile olusturuyoruz
        if (!file.exists()){// file yoksa olusturuyoruz

            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        // dosyaya veri yaziyoruz

        try {// eger dosyayi sifirlatmayip esksinin ustune yazacaksaniz FileWriter da append : true olmali
             // append false ise eski yazdiklarimizi siler
            FileWriter fWriter = new FileWriter(file,false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(gunStr);
            bWriter.newLine();
            bWriter.write(notStr);
            bWriter.newLine();
            bWriter.close();
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
