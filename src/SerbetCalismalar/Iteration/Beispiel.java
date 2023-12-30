package SerbetCalismalar.Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Beispiel {
    public static void main(String[] args) {
        String str = "iteration";
        ArrayList<String> iteration = new ArrayList<>(Arrays.asList(str.split("")));

        ListIterator<String> sortieren = iteration.listIterator();
        System.out.println("sortieren = " + sortieren);
        while (sortieren.hasNext()){
            System.out.println("sortieren.hasNext() = " + sortieren.next());
        }
        System.out.println("sortieren.previous() = " + sortieren.previous());
    }
}
