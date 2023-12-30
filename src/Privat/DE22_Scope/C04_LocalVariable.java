package Privat.DE22_Scope;

import java.util.Scanner;

public class C04_LocalVariable { //Class level

    public static void main(String[] args) {//main level
        // Scope un içinde tanımlanan variable sadece scope da geçerlidir


        scope3();


    } //main sonu

    private static void scope1() {
        do {
            int a = 10;
        } while (3 == 3);
        //   System.out.println(a);
    }

    private static void scope2() {
        int b = 1;
        for (int i = 0; i < 10; i++) {
            b++;
        }
        System.out.println(b);
    }

    private static void scope3() {
        int b = 1;
        int a = 1;
        for (int i = 0; i < 10; i++) b++;
        a++;
        System.out.println(b); // b = 11;
        System.out.println(a); // a = 2;

    }

    private static void scope4() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b > 10)
            for (int i = 0; i < 10; i++) {
                b++;
            }
        else System.out.println("for çalışmadı");


        System.out.println(b);//
    }

    private static void scope5() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b > 1) if (b > 2) if (b > 3) b++;
        // aynısını parantezler le yazalım ( alttaki tercihtir
        if (b > 1) {
            if (b > 2) {
                if (b > 3) b++;
                else b--;
            }
        }

    }
    private static void scope6() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b%2 == 0) System.out.println("çift sayıdır");
        else System.out.println("tek sayıdır");

        // alttaki de aynısı, ustteki tercihtir

        if (b%2 == 0) {
            System.out.println("çift sayıdır");
        }
        else {
            System.out.println("tek sayıdır");
        }


    }


}//class sonu
