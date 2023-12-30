package Privat.Projeler.ProjeNotDefteri;

import java.io.*;

public class Beispiel {
    public static void main(String[] args) throws IOException {
        String ad = "Rasit";
        String soyAd = "Sivasli";
        int yas = 40;
        String path = "C:\\Users\\sivas\\OneDrive\\Masaüstü\\Proje/dosya10.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);// Zorunlu degil, faydali
        String adFormat = String.format("%10s",ad);
        String soyAdFormat = String.format("%10s",soyAd);
        String yasFormat = String.format("%10s",yas);
        bWriter.write(adFormat);
        bWriter.write(soyAdFormat);
        bWriter.write(yasFormat);

        bWriter.close();

        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;
        while ((line=bReader.readLine())!=null){
            ad=line.substring(0,10);
            soyAd=line.substring(0,10);
            String yass = line.substring(20,30);
            ad = ad.replaceAll(" ","");
            soyAd = soyAd.replaceAll(" ","");
            yass=yass.replaceAll(" ","");
            yas = Integer.parseInt(yass);
            System.out.println(ad+" "+soyAd+" "+yas);
        }



    }
}
