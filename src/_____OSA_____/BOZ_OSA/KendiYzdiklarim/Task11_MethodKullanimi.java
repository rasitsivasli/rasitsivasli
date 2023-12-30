package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task11_MethodKullanimi {

    // kodun ciktisi ne olur?

    public static long square(int x) {
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int valeu = 9;
        long result = square(valeu);
        System.out.println("valeu = " + valeu);
        System.out.println("result = " + result);
    }
}
