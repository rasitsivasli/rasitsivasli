package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class TaskVonAsyaHanim2 {
    public static void main(String[] args) {
        Map<String, Integer> muhtesem7 = new HashMap<>();
        muhtesem7.put("Beyza", 13100);
        muhtesem7.put("Rasit", 13000);
        muhtesem7.put("Ebru", 12700);
        muhtesem7.put("Yasin", 13000);
        muhtesem7.put("Nuray", 12600);
        muhtesem7.put("Mahmut", 12900);
        muhtesem7.put("Ercan", 12800);


        for (Map.Entry<String, Integer> entry : muhtesem7.entrySet()) {
            entry.setValue(entry.getValue()+500);
            System.out.println(entry.getKey() +"  Hocam---->"+" Yeni Maas : " + entry.getValue());
        }

    }
}
