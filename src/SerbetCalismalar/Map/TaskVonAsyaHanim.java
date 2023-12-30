package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class TaskVonAsyaHanim {
    public static void main(String[] args) {
        Map<String, Integer> muhtesem7 = new HashMap<>();
        muhtesem7.put("Beyza", 13100);
        muhtesem7.put("Rasit", 13000);
        muhtesem7.put("Ebru", 12700);
        muhtesem7.put("Yasin", 13000);
        muhtesem7.put("Nuray", 12600);
        muhtesem7.put("Mahmut", 12900);
        muhtesem7.put("Ercan", 12800);

        int enYuksekMaas = muhtesem7.get("Rasit");
        int enDusukMaas = muhtesem7.get("Rasit");
        String isim = "";
        for (Map.Entry<String, Integer> maas : muhtesem7.entrySet()) {
            if (enYuksekMaas < maas.getValue()) {
                isim = maas.getKey();
                enYuksekMaas = maas.getValue();
            }

            if (enDusukMaas > maas.getValue()) {
                isim = maas.getKey();
                enDusukMaas = maas.getValue();
            }
        }
        System.out.println("Isim : " + isim + "--->enYuksekMaas = " + enYuksekMaas);
        System.out.println("Isim : " + isim + "--->enDusukMaas = " + enDusukMaas);
        int count = 0;
        for (Map.Entry<String, Integer> maas : muhtesem7.entrySet()) {
            if (maas.getValue() > 12700) {
                System.out.println("isim : " + maas.getKey() + "--->  maas = " + maas.getValue());
                count++;
            }
        }
        System.out.println("12.700 den fazla alanlarin sayisi = " + count);

        // bu bize tüm key ve value berbaer yazdirir
        for (Map.Entry<String, Integer> entry : muhtesem7.entrySet()) {
            System.out.println("entry = " + entry);
        }
    }
}
