package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C07_PuttAll {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("Germany", "Berlin");
        map1.put("Holand", "Amsterdam");
        map1.put("Belgium", "Brussels");
        map1.put("Ranska", "Paris");

        map2.put("Turkiye", null);
        map2.put("Misir", null);
        map2.put("Suriye", "Domescus");
        map2.put("Iran", "Tahran");
        map1.putAll(map2);
        for (String key : map1.keySet()) {
            System.out.printf("%-10s%-10s\n",key, map1.get(key));
        }
    }
}
