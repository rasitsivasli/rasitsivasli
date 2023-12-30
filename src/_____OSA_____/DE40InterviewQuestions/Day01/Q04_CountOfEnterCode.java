package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. ( 4 kez deneme hakkı olsun)
    public static void main(String[] args) {
        String pin;
        int girisHakki = 4;
        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sifrenizi giriniz : ");
            pin = scanner.next();
            if ("merhaba1234".equals(pin)) {
                System.out.println("Sifreniz dogrudur");
            } else {
                count++;
                System.out.println("Sifreniz yanlistir. Kalan deneme hakkiniz : " + (girisHakki - count));

            }
        } while (count<girisHakki);
    }
}


