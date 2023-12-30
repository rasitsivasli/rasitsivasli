package SerbetCalismalar.Iteration;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Harika", "Eda", "Hasan","Ceren", "Tugba", "Taha", "Ismail", "Murat", "Yahya", "Hâle"));
        ListIterator listIterator = list.listIterator();
        System.out.println("Simdi bastan itibaren siralaniyor");
        while (listIterator.hasNext()){
            System.out.println("listIterator.next() = " + listIterator.next());
        }
        System.out.println("================================");
        System.out.println("Burada sondan itibaren siralaniyor");
        while (listIterator.hasPrevious()){
            System.out.println("listIterator.next() = " + listIterator.previous());
        }
        System.out.println("*******2. yol**********");
        System.out.println("list = " + list);
        ListIterator listIterator2 = list.listIterator(list.size());// bu sekilde pointeri sona götürüyoruz.

        while (listIterator2.hasPrevious()){
            System.out.println(listIterator2.previous());
        }

    }
}
