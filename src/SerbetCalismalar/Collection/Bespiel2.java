package SerbetCalismalar.Collection;

import java.util.*;

public class Bespiel2 {
    public static void main(String[] args) {
        HashSet hSet = new HashSet<>();// nesene türü belirlemezsen her türlü nesneyi alir
        TreeSet<Integer> tSet = new TreeSet<>();

        hSet.add("ali");
        hSet.add(7);
        System.out.println("hSet = " + hSet);

  /*      long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random()*1000);
            hSet.add(random);
        }
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random()*1000);
            tSet.add(random);
        }
        long t3 = System.currentTimeMillis();
    }*/
    }
}