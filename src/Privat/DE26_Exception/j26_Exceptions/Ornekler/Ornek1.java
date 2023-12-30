package Privat.DE26_Exception.j26_Exceptions.Ornekler;

import java.io.File;
import java.io.IOException;

public class Ornek1 {
    public static void main(String[] args) {
        String filePath = System.getProperty(("user.dir")+"/dosya.txt");
        File file = new File(filePath);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {// IOException daha dar kapsamli bir Exception
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
    }
}
