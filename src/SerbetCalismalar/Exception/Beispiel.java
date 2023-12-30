package SerbetCalismalar.Exception;

import java.util.Scanner;

public class Beispiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.next();
        if (!(pass.charAt(0)>='A' && pass.charAt(0)<'Z')){
            throw new RuntimeException("Ilk harf büyük olmali");
        }
        System.out.println("Main bitti");
    }
}
