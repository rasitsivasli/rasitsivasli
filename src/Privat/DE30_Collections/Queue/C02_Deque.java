package Privat.DE30_Collections.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList<>(Arrays.asList("javaCAN", "javaSU", "javvaNUR", "javaNAZ", "javaTAR"));
        dq1.add("hasan");
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());
        System.out.println(dq1.peek()); // getFirst Gibi
        System.out.println(dq1.peekFirst()); // getFirst Gibi
        System.out.println(dq1.peekLast()); // getLast Gibi
        dq1.push("yeni eleman"); // başa eleman ekledi
        System.out.println("dq1.poll() = " + dq1.poll()); // ilk elemanı aldı ve sildi
        System.out.println(dq1);

        dq1.clear();
        System.out.println("dq2.pollFirst() = " + dq1.pollFirst());  //  null
        System.out.println("dq2.pollLast() = " + dq1.pollLast());  // null
        System.out.println("dq2.removeFirst() = " + dq1.removeFirst()); // rte-> NoSuchElementException
        System.out.println("dq2.removeLast() = " + dq1.removeLast()); //  rte-> NoSuchElementException

    }
}
