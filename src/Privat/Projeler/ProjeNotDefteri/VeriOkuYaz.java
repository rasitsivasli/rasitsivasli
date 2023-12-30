package Privat.Projeler.ProjeNotDefteri;

import java.io.*;

public class VeriOkuYaz {

    public static void veriYaz() throws IOException {
        String path = "C:\\Users\\sivas\\OneDrive\\Masaüstü\\OSA und ISTQB/dosya3.txt";
        File file = new File(path);
        if (!file.exists()) file.createNewFile();
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        for (int i = 0; i < Main.liste.size(); i++) {
            String line = Main.liste.get(i).getNo()+"*"+Main.liste.get(i).getNot();
            bWriter.newLine();
            bWriter.write(line);

        }

    }

    public static void veriOku() throws IOException {
        String path = "C:\\Users\\sivas\\OneDrive\\Masaüstü\\OSA und ISTQB/dosya3.txt";
        File file = new File(path);
        if (!file.exists()) file.createNewFile();
        FileReader fileReader = new FileReader(path);
        BufferedReader bReader = new BufferedReader(fileReader);
        String line;
        while ((line = bReader.readLine()) != null) {
            int index = line.indexOf("*");
            int no = Integer.parseInt(line.substring(0,index));
            String not = line.substring(index+1);
            Kayit kayit = new Kayit(no,not);
            Main.liste.add(kayit);
        }
        bReader.close();
        fileReader.close();
    }
}
