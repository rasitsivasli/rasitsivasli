package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * Örnek:  input            output
     *  1 -    elma  2           eaea
     *  2 -    army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str = scanner.nextLine();
        System.out.print("bir sayi giriniz :");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            System.out.print(str.charAt(0)+""+str.charAt(str.length()-1));
        }

    }


}
