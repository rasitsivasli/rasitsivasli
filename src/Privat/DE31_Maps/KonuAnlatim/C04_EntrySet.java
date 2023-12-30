package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C04_EntrySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");
        System.out.println(map);
        System.out.println(map.entrySet());

        for(Map.Entry<String,String> key_val:map.entrySet() ){
            System.out.println(key_val.getKey()+" "+key_val.getValue());
        }
        System.out.println();
        // veya
        for (String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println();
        // veya (bad practice)
        for(Map.Entry<String,String> key_val:map.entrySet() ){
            String key = key_val.getKey();
            System.out.println(key+" "+map.get(key));
        }

    }
}
