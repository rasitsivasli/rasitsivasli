package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C05_Clear_Size_isEmpty {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");
        map.put("Turkiye",null);
        map.put("Misir",null);

        System.out.println("size = "+map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());
        map.clear();
        System.out.println("size = "+map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());
    }
}
