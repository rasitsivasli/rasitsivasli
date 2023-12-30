package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class MapGet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin,Bonn");// ayni key sahip olanlardan sonuncuyu kabul eder
        map.put("Holand","Amsterdam,Terdam");
        map.put("Belgium","Brussels,Bern");

        System.out.println(map.get("Holand"));

        for (Map.Entry<String,String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key : "+key +"," +" value : "+value);
        }
    }
}
