package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;

public class C09_Replace {
    //map.replace();-> girilen  value değeri ilgili Key'de update edilip
    // oldValue(update öncesi eski value) return edilir.
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        // key varsa value yu değiştirir ve eski value yu dönderir,
        // key yok ise, bi iş yapmaz null dönderir
        System.out.println(hm.replace("Amazon", "300 Euro")); //
        System.out.println(hm.replace("amazon", "500 Euro"));

        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }

    }
}
