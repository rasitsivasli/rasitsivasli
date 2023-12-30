package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMtodlar {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","");// ayni key sahip olanlardan sonuncuyu kabul eder
        map.put("Holand","Amsterdam,Terdam");
        map.put("Belgium","Brussels,Bern");

        System.out.println("map.get(\"Germany\").isEmpty() = " + map.get("Germany").isEmpty());
        map.put("Germany","SAMSUN");
        System.out.println("map.get(\"Germany\") = " + map.get("Germany"));

        Map<String, String> salih = new HashMap<>();
        salih.put("renkler", "Sari,Yesil");
        salih.put("Oyunlar", "Minecraft,Shcach");
        System.out.println("===========");
        map.putAll(salih);
        for (String key: map.keySet()) {
            System.out.printf("%-10s%-10s\n",key,map.get(key));
        }

        System.out.println("==============");
        if (map.containsKey("Germany")) map.put("Germany","Bonn");
        System.out.println(map);
        System.out.println("============");
        System.out.println("map = " + map);
        String value = "Bonn";
        for (String key:map.keySet()) {
            if (map.get(key).equals(value)) System.out.println(key);
        }
        System.out.println("map.getOrDefault(\"Germany\",\"\") = " + map.getOrDefault("German", "istanbul"));
        System.out.println("map = " + map);

        map.put("Turkey","istanbul");
        System.out.println(map);
        System.out.println(map.remove("Turkey"));
        System.out.println("map = " + map);

    }
}
