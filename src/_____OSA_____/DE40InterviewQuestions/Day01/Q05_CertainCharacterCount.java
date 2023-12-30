package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere kullanildigini bulup, yazdirin
     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz :");
        String cumle = scan.nextLine();
        System.out.print("Harf giriniz :");
        char harf = scan.next().charAt(0);
        int count = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==harf){
                count++;
            }
        }
        System.out.println(harf+" harfi cumlede "+count+" adet vardir");;
    }

}
