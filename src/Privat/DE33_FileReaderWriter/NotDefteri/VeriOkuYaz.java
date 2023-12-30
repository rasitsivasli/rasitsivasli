package Privat.DE33_FileReaderWriter.NotDefteri;

import java.io.*;

public class VeriOkuYaz {


    public static void verioku() throws IOException {
        // buranın işi verileri arrayListe doldurmak
        String filePath = System.getProperty("user.dir") + "/dosya1.txt";
        File file = new File(filePath);
        if (!file.exists()) file.createNewFile();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bReader = new BufferedReader(fileReader);
        String line;
        while ((line = bReader.readLine()) != null) {
            int idx =  line.indexOf("*"); // "*" yıldızın index i
            int no  = Integer.parseInt(line.substring(0,idx ));
            String not = line.substring(idx+1);
            Kayit kayit = new Kayit(no,not);
            Main.liste.add(kayit);
        }

        bReader.close();
        fileReader.close();
    }

    public static void veriyaz() throws IOException {
        String filePath = System.getProperty("user.dir") + "/dosya1.txt";
        File file = new File(filePath);
        if (!file.exists()) file.createNewFile();
        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        for (int i = 0; i <Main.liste.size() ; i++) {
            String line = Main.liste.get(i).getNo()+"*"+Main.liste.get(i).getNot();
            bWriter.write(line);
            bWriter.newLine();
        }
        bWriter.close();
        fWriter.close();

    }
}
