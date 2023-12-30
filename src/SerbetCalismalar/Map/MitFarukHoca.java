package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class MitFarukHoca {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin,Bonn");// ayni key sahip olanlardan sonuncuyu kabul eder
        map.put("Holand","Amsterdam,Terdam");
        map.put("Belgium","Brussels,Bern");
        System.out.println("map.size() = " + map.size());
        System.out.println(map.keySet());

        //map.put("Holand","Berlin");// put ayni zamanda set gibi calsisir yani eleman da degistiriri. eger key ler ayni ise



        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());

        for (String key: map.keySet()) {
            System.out.printf("%-10s%-10s\n",key,map.get(key));
        }
    }
}
