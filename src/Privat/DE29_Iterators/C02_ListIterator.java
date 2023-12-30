package Privat.DE29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan",
                "Ceren", "Tugba", "Taha", "Ismail", "Murat","Yahya","Hâle"));
        List<Integer> listInt = new ArrayList<>(Arrays.asList(4,2,6,11,7,43,2,8));
        ListIterator<String> listItr = list.listIterator(3); // 3.elemanın başına konumlandırır
        listItr = list.listIterator(list.size());// en sona konumlandırır
        System.out.println(listItr.previous());
        listItr.set("yeni");
        System.out.println(list); // pointerin sağındakinin üzerine yazar
        System.out.println(listItr.previous());
        listItr.add("adding");
        System.out.println(list);
        System.out.println(listItr.next());

    }
}
