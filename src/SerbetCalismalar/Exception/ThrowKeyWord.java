package SerbetCalismalar.Exception;


import java.util.Scanner;

public class ThrowKeyWord {

    public static void main(String[] args) {
        //throw new  RuntimeException(); // yeni bir hata olusturmak icin olsun

       int yas;

        do { Scanner scanner = new Scanner(System.in);
            System.out.println("Yasinizi giriniz : ");
            yas = scanner.nextInt();

        }while (yas>18); throw new RuntimeException();
    }
}
