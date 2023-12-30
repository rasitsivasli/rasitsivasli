package SerbetCalismalar.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Beispiel2 {
    public static void main(String[] args) {

        LinkedList<Integer> lList = new LinkedList<>();
        ArrayList<Integer> aList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            int sayi = (int) (Math.random()*100);
            lList.add(sayi);
            aList.add(sayi);
        }
        int toplamAlist = 0;
        int toplamLlist = 0;
        int N = 100000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int sayi = (int) (Math.random()*100000);

            aList.addFirst(sayi);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Alist süre = "+(t2-t1));

        for (int i = 0; i < N; i++) {
            int sayi = (int) (Math.random()*100000);
            lList.addFirst(sayi);
        }

        long t3 = System.currentTimeMillis();
        System.out.println("llist süre = "+(t3-t2));
    }
}
