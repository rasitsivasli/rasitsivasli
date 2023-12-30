package SerbetCalismalar.Collection.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Beispiel1 {
    public static void main(String[] args) {

        LinkedList <Integer>lList = new LinkedList<>();
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println("aList = " + aList);

        for (int i = 0; i < 100000; i++) {
            int sayi = (int) (Math.random()*100);
            lList.add(sayi);
            aList.add(sayi);
        }
        int toplamAlist = 0;
        int toplamLlist = 0;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int idx = (int) (Math.random()*100000);
            toplamAlist += aList.get(idx);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Alist süre = "+(t2-t1));
        for (int i = 0; i < 10000; i++) {
            int idx = (int) (Math.random()*100000);
            toplamAlist += aList.get(idx);
        }
        for (int i = 0; i < 10000; i++) {
            int idx = (int) (Math.random()*100000);
            toplamLlist += lList.get(idx);
        }
        long t3 = System.currentTimeMillis();
        System.out.println("Alist süre = "+(t3-t2));
    }// Fazit = Array list 100 misli daha hizli listede eleman bulmada
}
