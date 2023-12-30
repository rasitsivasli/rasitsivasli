package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task16_Do_WhileLoop {
    public static void main(String[] args) {

        // Asagidaki kod blogu calistirilirsa sonuc ne olur?


        int m = 9, n = 1, x = 0;
        do {
            m--;
            n += 2;
            x += m + n;

        } while (m > n);

        System.out.println(x);

    }


}
