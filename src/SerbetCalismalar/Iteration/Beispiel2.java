package SerbetCalismalar.Iteration;

import java.util.*;
import java.util.ListIterator;

public class Beispiel2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Hayriye", "Selim", "Seref"));

        ListIterator<String> iterator = list.listIterator();


        while (iterator.hasNext()) {
            System.out.println("listIterator.next() = " + iterator.next());
        }
        System.out.println("Simdi soldan itibaren yaziyoruz ");
        while (iterator.hasPrevious()) {
            System.out.println("listIterator.next() = " + iterator.previous());
        }
        System.out.println("===========");
        iterator.set("Ayse");// burada pointerin önündeki elemani degistirdik
        while (iterator.hasNext()) {
            System.out.println("listIterator.next() = " + iterator.next());
        }
        System.out.println("listIterator.nextIndex() = " + iterator.nextIndex());// siradaki indexi gösterir
        System.out.println("list = " + list);


    }
}
