package FarukHocaYeni.DE33_FileReaderWriter.NotDefteri;

import Privat.Projeler.ProjeAdresSunum.KendiYaptigim.FileHelper;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() throws IOException {
        FileHelper kisiOlustur = new FileHelper();
        kisiOlustur.veriYaz();
    }
}
