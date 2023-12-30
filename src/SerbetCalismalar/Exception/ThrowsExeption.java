package SerbetCalismalar.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Thread.sleep(1000);
        FileInputStream file = new FileInputStream("Asya.txt");
        System.out.println("Main blogu bitti");

    }
}
