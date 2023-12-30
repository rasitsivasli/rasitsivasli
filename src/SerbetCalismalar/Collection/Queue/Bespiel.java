package SerbetCalismalar.Collection.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bespiel {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCan","JavaSu","JavvNur","JavaNaz"));
        
        q1.add("Hasan");
        System.out.println("q1 = " + q1);
        System.out.println("peek = " + q1.peek());
        System.out.println("q1 = " + q1);
        System.out.println("poll = " + q1.poll());// remove ile ayni
        System.out.println("q1 = " + q1);
        System.out.println("remove = " + q1.remove());
        System.out.println("q1 = " + q1);
        System.out.println("poll = " + q1.poll());
        System.out.println("q1 = " + q1);
        System.out.println("element = " + q1.element());// peek in aynisi
        System.out.println("q1 = " + q1);

        Queue<String> q2 = new LinkedList<>(Arrays.asList());// bos yeni dizi tanimladim
        // poll ve remove farki
        System.out.println("q2.poll() = " + q2.poll());// eger dizi bos sa null yazar
        //System.out.println("q2.remove() = " + q2.remove());// eger dizi bos ise hata verir

        q1.offer("Ali");
        System.out.println("q1 = " + q1);

    }
}
