package SerbetCalismalar.Collection.Set;

import java.util.*;

public class Bespiel3 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "b", "12"));
        List<Integer> lList = new LinkedList<>();
        // Linkedliste ponter var direkt index yok
        //ArrayListe index yapisi var
        // her ikisi de Interface den olusturuldu
        System.out.println("l1.get(1) = " + l1.get(1));
        Collection<String> listAllAdd = new ArrayList<>();

        System.out.println("listAllAdd = " + listAllAdd);

        System.out.println("l1.clone() = " + l1.clone());

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 5, 7, 9, 15, 364, 25));
        ArrayList<Integer> listBos = new ArrayList<>();
        Iterator<Integer> itr = list.iterator();
        Set<Integer> list3 = new TreeSet<>();
        list3.addAll(list);
        Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("list3 = " + list3);

        while (itr.hasNext()) {
            if (itr.next()>4){
                itr.remove();
            }
        }
        System.out.println("list = " + list);
        System.out.println();
        while (itr.hasNext()) {
            if (itr.next()<4){
               System.out.println();
            }

        }System.out.print(listBos);


    }
}
