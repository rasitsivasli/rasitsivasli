package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {// tüm set anlamaina geliyor

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Germany", "Berlin,Bonn");
        map.put("Holand", "Amsterdam,Terdam");
        map.put("Belgium", "Brussels,Bern");
        System.out.println(map);
        System.out.println(map.entrySet());
        for (Map.Entry<String, String> key_val : map.entrySet()) {
            System.out.println(key_val.getKey() + "-->" + key_val.getValue());
        }
        System.out.println("============");
        // bad practice
        for (Map.Entry<String, String> key_val : map.entrySet()) {
            System.out.println(key_val.getKey() + "-->" + map.get(key_val.getKey()));
        }
    }
}
