package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C16_MapWithPOJO {
    static int id = 101;
    public static void main(String[] args) {
        Map<Integer,Adres> hMap = new HashMap<>();
        Adres adr = new Adres("a mahallesi","a caddesi",id++);
        hMap.put(adr.getId(),adr);
        adr = new Adres("b mahallesi","b caddesi",id++);
        hMap.put(adr.getId(),adr);
        adr = new Adres("c mahallesi","c caddesi",id++);
        hMap.put(adr.getId(),adr);
        for (Map.Entry<Integer,Adres> val : hMap.entrySet()) {
            System.out.println(val.getKey()+" "+val.getValue());
        }
        // 102 nolu id olan kaydı değiştirelim
        int dKey = 102;
//        adr = new Kisiler();
//        adr = hMap.get(dKey);
//        adr.setCadde("YENI CADDE");
        // hMap.put(dKey,adr);
        // üstteki 4 satır yerine alttakini yaptık, çok daha iyi oldu

        hMap.get(dKey).setCadde("yeni CAdde");
        // obje ler mutable olduğu için metottaki(setCadde) değişiklikler, çağrıldığı yerde de değişir


        System.out.println();
        for (Map.Entry<Integer,Adres> val : hMap.entrySet()) {
            System.out.println(val.getKey()+" "+val.getValue());
        }


    }
}
