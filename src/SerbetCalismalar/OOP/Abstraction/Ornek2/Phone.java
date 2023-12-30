package SerbetCalismalar.OOP.Abstraction.Ornek2;

import java.util.ArrayList;
/*
4 class oluşturulmuştur. Phone, Apple, Samsung, ClassMain

   Phone'u super class yapın.

   cart isimli, String'i alarak bir static arraylist oluşturun.

   getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.

   ve return tipi int;
   arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
   sonra bunları int'e çevirin.
   tüm sayıları toplayın.

   ismi options olan bir abstract method oluşturun.*/

public abstract class Phone {

    static ArrayList<String> cart = new ArrayList<>();

    public static int getSum(){

        return 0;
    }


}
