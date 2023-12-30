package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C15_NestedMap {
    public static void main(String[] args) {
        HashMap<String,String> il = new HashMap<>();
        HashMap<Integer,HashMap<String,String>> iller = new HashMap<>();
        il.put("isim","ŞanlıUrfa");
        il.put("nufus","1200000");
        il.put("ilçe sayısı","12");
        il.put("bolge","Guney Doğu");
        iller.put(63,il);

        il = new HashMap<>();
        il.put("isim","Trabzon");
        il.put("nufus","750000");
        il.put("ilçe sayısı","9");
        il.put("bolge","Karadeniz");
        iller.put(61,il);

        il = new HashMap<>();
        il.put("isim","İzmir");
        il.put("nufus","3900000");
        il.put("ilçe sayısı","15");
        il.put("bolge","Ege");
        iller.put(35,il);
      //  System.out.println(iller);
        for (Map.Entry<Integer,HashMap<String,String>> val: iller.entrySet()){
            System.out.println(val);
            for (String ilKey:val.getValue().keySet()) {
                System.out.println(val.getKey()+" "+ilKey+" "+val.getValue().get(ilKey));
            }
        }
        // 2. print şeklimiz
        System.out.println("-------------------");
        for (Map.Entry<Integer,HashMap<String,String>> val: iller.entrySet()){
            System.out.println(val);
            for (Map.Entry<String,String> ilVal:val.getValue().entrySet()) {
                System.out.println(val.getKey()+" "+ilVal.getKey() + " "+ilVal.getValue());
            }
        }



    }
}
