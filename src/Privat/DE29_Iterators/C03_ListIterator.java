package Privat.DE29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan",
                "Ceren", "Tugba", "Taha", "Ismail", "Murat","Yahya","Hâle"));
        ListIterator<String> listItr = list.listIterator(list.size());
        int index = list.indexOf("yahya");
        listItr = list.listIterator(index);
        // List iterotor yardımı ile sondan başa yazdırınız
        while (listItr.hasPrevious()) { // solunda eleman varsa true yoksa false dönderir
            System.out.print(listItr.previous()+" ");
        }
        System.out.println();
        // pointer nerede? cvp : en başta
        while (listItr.hasNext()) {
            System.out.print(listItr.next()+" ");
        }


    }
}
