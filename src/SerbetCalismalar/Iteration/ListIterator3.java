package SerbetCalismalar.Iteration;


import java.util.*;

public class ListIterator3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Harika", "Eda", "Hasan","Ceren", "Tugba", "Taha", "Ismail", "Murat", "Yahya", "Hâle"));
        Iterator<String> iterator = list.iterator();
        // for kullanarak bastan sona yazdirin

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(iterator.next()+",");
        }

    }
}
