package Privat.DE31_Maps.KonuAnlatim;

import java.util.HashMap;
import java.util.Map;

public class C01_Map {
    /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

       1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir.
                   Key değeri benzersiz(unique) olmalı       dublicate kabul etnez
                   Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
                   null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                   HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
                   HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
                   HashMap'ler "thread safe" degildir.
        */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("Holand","Amsterdam");
        map.put("Belgium","Brussels");
        map.put("Ranska","Paris");
        String str = map.put("Ranska","Pariisi");
        System.out.println(str);
//        System.out.println(map.size());
//        System.out.println(map.get("Germany"));

    }
}
