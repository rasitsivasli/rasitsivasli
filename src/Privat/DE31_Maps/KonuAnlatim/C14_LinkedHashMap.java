package Privat.DE31_Maps.KonuAnlatim;

import java.util.LinkedHashMap;

public class C14_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> hm = new LinkedHashMap<>();//bos hm tanımlandı
            // giriş sırasını korur
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Meknoso", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        for (String key : hm.keySet()){
            System.out.println(key+", "+ hm.get(key));
        }
    }
}
