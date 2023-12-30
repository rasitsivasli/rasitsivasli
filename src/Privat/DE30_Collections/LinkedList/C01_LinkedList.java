package Privat.DE30_Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class C01_LinkedList {
    /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
        5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
         */
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        ArrayList<Integer>  aList = new ArrayList<>();
        for (int i = 0; i <100000 ; i++) {
            int sayi = (int) (Math.random()*100);
            lList.add(sayi);
            aList.add(sayi);
        }

        int toplamAlist=0;
        int toplamLlist=0;
        long t1=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            int idx = (int) (Math.random()*100000);
            toplamAlist += aList.get(idx);

        }
        long t2=System.currentTimeMillis();
        System.out.println("Alist süre = "+(t2-t1));
        for (int i = 0; i <100000 ; i++) {
            int idx = (int) (Math.random()*100000);
            toplamLlist += lList.get(idx);
        }
        long t3=System.currentTimeMillis();
        System.out.println("Llist süre = "+(t3-t2));
        // sonuç arrayList 1000 kat daha hızlı sonuç verdi


    }
}
