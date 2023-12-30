package Privat.DE29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan",
                "Ceren", "Tugba", "Taha", "Ismail", "Murat","Yahya","Hâle"));
        Iterator<String> itr = list.iterator();
        // for kullanarak, baştan sona yazdırınz
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        int i;
        for (i = 0; itr.hasNext() ; i++) {
            System.out.println(itr.next());
        }





    }
}
