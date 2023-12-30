package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;

public class C10_Remove {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Meknoso", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println(hm.remove("Saturn")); // key eşleşirse sildi
        // alttakiler hem key hem value eşleşirse sil
        System.out.println(hm.remove("Teknosa","300 Euro")); // silemedi false dönderir
        System.out.println(hm.remove("Teknosa","333 Euro")); // sildi true dönderdi
        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }
    }
}
