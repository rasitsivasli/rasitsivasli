package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C02_KeySet_Values {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");

        System.out.println(map.keySet());
        System.out.println(map.values());
        for (String key : map.keySet()){
            System.out.printf("%-10s%-10s\n",key,map.get(key));
        }
        for (String val:map.values()) {
            System.out.println(val);
        }
    }
}
