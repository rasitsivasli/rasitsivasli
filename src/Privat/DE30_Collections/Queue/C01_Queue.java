package Privat.DE30_Collections.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /* ahan da Trick kösesinde bugun :
        poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        poll ise null return eder
            */
        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCAN","javaSU","javvaNUR","javaNAZ"));
        q1.add("hasan");
        String eleman1 = q1.peek();
        String eleman2 = q1.poll(); // = q1.remove() tamamen aynı sadece , eleman yok ise pool() null verir,
                                    // remove() exception fırlatır

        System.out.println(q1);
        System.out.println("peek = " + eleman1);
        System.out.println("eleman2 = " + eleman2);

        eleman1 = q1.element(); // peek() ile tamamen aynı
        System.out.println(q1);
        System.out.println("element = " + eleman1);

//        for (int i = 0; i <10 ; i++) {
//            System.out.println(q1.remove());
//        }
        q1.offer("mehmet");
        System.out.println(q1);
        q1.clear();//q1 temizlendi->tüm elemanlar silindi
        System.out.println("q1.size() = " + q1.size()); //0
        System.out.println("q1.isEmpty() = " + q1.isEmpty());// true


    }
}
