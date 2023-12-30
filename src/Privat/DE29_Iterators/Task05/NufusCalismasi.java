package Privat.DE29_Iterators.Task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class NufusCalismasi {
    public static void main(String[] args) {
        NufusBilgileri n1= new NufusBilgileri("mehmet", "kurban", 19);
        NufusBilgileri n2= new NufusBilgileri("ahmet", "ayaz", 25);
        NufusBilgileri n3= new NufusBilgileri("ali", "demir", 30);

        ArrayList<NufusBilgileri> list = new ArrayList<NufusBilgileri>();
        list.addAll(Arrays.asList(n1,n2,n3));

        System.out.println("for-each ile");

        for (NufusBilgileri nB : list) {
            System.out.println("ad "+ nB.getAd()+" Soyad "+nB.getSoyad()+" Yas "+nB.getYas());
        }
        System.out.println("**************************");
        Iterator<NufusBilgileri> it1 = list.iterator();
        System.out.println("iterator ile");
        while (it1.hasNext()) {
            NufusBilgileri n = it1.next();
            System.out.println("ad "+ n.getAd()+" Soyad "+n.getSoyad()+" Yas "+n.getYas());
        }
        System.out.println("**************************");
        ListIterator<NufusBilgileri> it2 = list.listIterator();
        System.out.println("list iterator ile bastan sona dogru");
        while (it2.hasNext()) {
            NufusBilgileri n = it2.next();

            System.out.println("ad "+ n.getAd()+" Soyad "+n.getSoyad()+" Yas "+n.getYas());
        }
        System.out.println("**************************");
        System.out.println("list iterator ile sondan basa dogru");
        while (it2.hasPrevious()) {
            NufusBilgileri n = it2.previous();
            System.out.println("ad "+ n.getAd()+" Soyad "+n.getSoyad()+" Yas "+n.getYas());
        }

    }
}

