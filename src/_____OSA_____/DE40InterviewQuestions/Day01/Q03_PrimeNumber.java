package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scanner.nextInt();
        int count = 0;
        if (sayi<2) System.out.println("En kucuk asal sayi 2 dir");
        else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {// bir sayinin kareköküne kadar olan bölenlerini kontrol etmek yeterlidir
                if (sayi % i == 0) {
                    count++;
                }
            }
            if (count > 0) System.out.println("Sayi asal degildir");
            else System.out.println("Sayi asaldir");
        }


    }


}
