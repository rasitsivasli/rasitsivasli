package Privat.DE26_Exception;

import java.io.File;
import java.io.IOException;

public class C03_IOException {
    public static void main(String[] args)  {
        String filePath=System.getProperty("user.dir")+"/dosya.txt";
        File file =new File(filePath);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("dsfşlasjdfşldkjasf " + e);
                throw new RuntimeException(e);
            } finally {
                System.out.println("file = " + file);
            }
        }
    }
}
