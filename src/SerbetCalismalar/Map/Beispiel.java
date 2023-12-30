package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class Beispiel {
    public static void main(String[] args) {
        Map<String, String> salih = new HashMap<>();
        salih.put("renkler", "Sari,Yesil");
        salih.put("Oyunlar", "Minecraft,Shcach");
        Map<String, String> suat = new HashMap<>();
        suat.put("renkler", "Kahve,Kirmizi,Beyaz");
        suat.put("filmler", "anime,cizgiDizi,aktion");
        Map<String, String> ayse = new HashMap<>();
        ayse.put("renkler", "Siyah,Mor,Lila");
        ayse.put("yemekler", "cikolata,kahve,meyve");

        Map<String, Map<String, String>> kisiler = new HashMap<>();
        kisiler.put("Ayse", ayse);
        kisiler.put("Suat", suat);
        kisiler.put("Salih", salih);
        System.out.println("kisiler = " + kisiler);

        for (String w : kisiler.keySet()) {
            System.out.println(w+"---"+kisiler.get(w));
        }
        System.out.println("===================");
  /*      Scanner scanner = new Scanner(System.in);
        System.out.print("Bir key giriniz : ");*/
        System.out.println("Suat = " + kisiler.get("Suat"));
        salih.putIfAbsent("elem","degil");
        System.out.println("salih = " + salih);


    }
}
