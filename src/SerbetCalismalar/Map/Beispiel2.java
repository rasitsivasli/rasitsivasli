package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class Beispiel2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for (Map.Entry<String, Integer> val : map.entrySet()) {
            System.out.println(val.getKey()+"--->"+val.getValue());
        }
        System.out.println("map.containsKey(2) = " + map.containsKey("A"));

    }
}
