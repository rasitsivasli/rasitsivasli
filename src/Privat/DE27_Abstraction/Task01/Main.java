package Privat.DE27_Abstraction.Task01;

public class Main {
    public static void main(String[] args) {
        int p1 = 10;
        int p2 = 20;
        Substract oSum = new Substract();

        int resultSum = oSum.calculating(p1,p2);
        System.out.println("resultSum = " + resultSum);

    }
}
