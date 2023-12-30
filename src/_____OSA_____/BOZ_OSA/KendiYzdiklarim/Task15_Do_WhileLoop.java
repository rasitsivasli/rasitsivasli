package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task15_Do_WhileLoop {
    public static void main(String[] args) {

        // Asagidaki kod blogu calistirilirsa sonuc ne olur?
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if (i==8) keepGoing = false;
            result-=2;

        }while (keepGoing);

        System.out.println(result);


    }


}
