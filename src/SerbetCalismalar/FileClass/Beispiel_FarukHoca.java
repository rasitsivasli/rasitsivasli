package SerbetCalismalar.FileClass;

import java.io.*;

public class Beispiel_FarukHoca {
    public static void main(String[] args) {
        // dosyanin  path i belirlenmeli

        String filePath= System.getProperty("user.dir)"+"/dosya1.txt");

        String str1 = "dosyaya veri yazalim2";
        String str2 = "dosyaya bir veri daha yazalim2";
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
            bWriter.write(str1);
            bWriter.newLine();
            bWriter.write(str2);
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
