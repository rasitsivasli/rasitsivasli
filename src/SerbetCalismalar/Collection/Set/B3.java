package SerbetCalismalar.Collection.Set;

import java.util.HashSet;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();
        hSet.add("Kamil");
        hSet.add("Selman");


        Scanner scanner = new Scanner(System.in);
        String str =  scanner.next();
        System.out.println("Eklenecek mi " + hSet.add(str));
        System.out.println("hSet = " + hSet);

    }
}
