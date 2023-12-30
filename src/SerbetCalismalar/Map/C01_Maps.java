package SerbetCalismalar.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class C01_Maps {

    public static void main(String[] args) {
        // 1- Bir map olusturmadan once, Map'e koyacagimiz Key ve Value degerlerini incelemeliyiz
        // Tum degerleri koyabilmek icin Key ve Value icin Object,Object secebiliriz
        // Ama bu durumda map icerisindeki elemanlara ait bilgilere ulasmakta zorlanabiliriz
        // Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
        // hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu secmeliyiz

        // 2- Map'i olustururken map'in turune de karar vermeliyiz.

        ArrayList<String> aSinifListesi = new ArrayList<>(Arrays.asList("Ali", "Veli", "Hayati", "Selim"));
        ArrayList<String> bSinifListesi = new ArrayList<>(Arrays.asList("Ayse", "Emine", "Kezban", "Sinan", "Senem"));

        HashMap<String, ArrayList> map = new HashMap<>();
        map.put("a", aSinifListesi);
        System.out.println("map = " + map);
        map.put("b", bSinifListesi);
        System.out.println("map = " + map);
        System.out.println("map.get(aSinifListesi) = " + map.get("a"));
        System.out.println("map.get(bSinifListesi) = " + map.get("b"));
        System.out.println("map.keySet() = " + map.keySet());
        for (String w : map.keySet()) {
            System.out.println(w + "----->" + map.get(w));
        }
        System.out.println(map.get("a").get(2));
        System.out.println("map.get(\"b\").size() = " + map.get("b").size());

        System.out.println();
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("SelimMudur","akif");
        System.out.println(map2);



    }

}
