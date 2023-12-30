package SerbetCalismalar.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ornek1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1,3,2,4,8,9,0,39));
        System.out.println("set1 = " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(1,3,7,5,4,0,7,5));
        System.out.println("set2 = " + set2);

        // set leri birlestiriyorum...
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        // set lerin ortak elemanini buluyorum...
        Set<Integer> ortakElemanlar = new HashSet<>(set1);
        ortakElemanlar.retainAll(set2);
        System.out.println("ortakElemanlar = " + ortakElemanlar);

        // farkli elemanlari bulma
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);// bu sekilde set2 nin tüm elemanlarini set 1 den kaldiriyoruz
        System.out.println("difference = " + difference);

        Set<Integer> difference2 = new HashSet<>(set2);
        difference.removeAll(set1);// bu sekilde de set1 nin tüm elemanlarini set 2 den kaldiriyoruz
        System.out.println("difference2 = " + difference2);
    }
}
