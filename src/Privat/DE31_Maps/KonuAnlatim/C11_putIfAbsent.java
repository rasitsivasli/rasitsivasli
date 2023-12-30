package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Meknoso", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        hm.putIfAbsent("A1","999 Euroa"); // yok ise ekler
        // yani alttaki işi yapıyor
        if (!hm.containsKey("A1")) hm.put("A1","888 Euroa");

        // put varsa değiştirir ( replace işini yapar) yoksa ekler ( putIfAbsent işini yapar)


        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }

    }
}
