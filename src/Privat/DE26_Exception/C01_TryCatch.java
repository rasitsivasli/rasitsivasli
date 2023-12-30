package Privat.DE26_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        System.out.print( " Sayıyı girinz : ");
        int yeniSayi;
        int sayi;
        boolean okumaBasarili;
        do {
            okumaBasarili=true;
            Scanner scanner = new Scanner(System.in);
            try {
                sayi = scanner.nextInt();
                yeniSayi  = 10 / (5-sayi);

            } catch (ArithmeticException e){
                okumaBasarili = false;
                System.out.println(e);
                System.out.print("sıfıra bölme hatası ");
            } catch (InputMismatchException e){
                okumaBasarili = false;
                System.out.println(e);
                System.out.print("hatalı veri girişi ");
            } catch (Exception e) {
                System.out.println("başka bir hata yakalandı");
            }
            finally {
                System.out.println("finaly block calıştı");
            }
        } while (!okumaBasarili);


    }





}
