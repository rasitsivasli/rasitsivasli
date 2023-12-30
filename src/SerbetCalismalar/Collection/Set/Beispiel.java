package SerbetCalismalar.Collection.Set;

import java.util.*;

public class Beispiel {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Yavuz","Kerim","ali","Selami"));
        Set<String> hs2 = new LinkedHashSet<>(Arrays.asList("yavuz","ali","selami"));
        Set<String> hs3 = new TreeSet<>(Arrays.asList("yavuz","ali","selami"));

        Iterator<String> itr = hs1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Object obj = hs1.clone();
        System.out.println(obj);
        System.out.println();

        Iterator<String > itrLhs= hs2.iterator();
        while (itrLhs.hasNext()){
            System.out.print(itrLhs.next()+" ");
        }
        System.out.println();
        Iterator<String> itrTs = hs3.iterator();
        while (itrTs.hasNext()){
            System.out.print(itrTs.next()+" ");
        }

    }
}
