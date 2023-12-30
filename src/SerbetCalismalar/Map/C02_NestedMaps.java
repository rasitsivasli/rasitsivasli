package SerbetCalismalar.Map;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

    public static void main(String[] args) {
        // icice map olusturacaksak en icerdekinden baslamaniz tavsiye olunur
        Map<Integer, Map<String, String>> sinifMap = new HashMap<>();
        Map<String, String> ogr1Map = new HashMap<>();
        ogr1Map.put("isim", "Ali");
        ogr1Map.put("soyisim", "Can");
        ogr1Map.put("brans", "J.dev");
        sinifMap.put(101, ogr1Map);

        Map<String, String> ogr2Map = new HashMap<>();
        ogr2Map.put("isim", "Veli");
        ogr2Map.put("soyisim", "Yan");
        ogr2Map.put("brans", "QA");
        sinifMap.put(102, ogr2Map);

        Map<String, String> ogr3Map = new HashMap<>();
        ogr3Map.put("isim", "Ali");
        ogr3Map.put("soyisim", "Yan");
        ogr3Map.put("brans", "C#");
        sinifMap.put(103, ogr3Map);

        Map<String, String> ogr4Map = new HashMap<>();
        ogr4Map.put("isim", "Ayse");
        ogr4Map.put("soyisim", "Can");
        ogr4Map.put("brans", "QA");
        sinifMap.put(104, ogr4Map);

        for (Map.Entry<Integer, Map<String, String>> e:sinifMap.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());

        }


    }

		
		/*
		 {
		 101={soyisim=Can, brans=J.dev, isim=Ali}, 
		 102={soyisim=Yan, brans=QA, isim=Veli}, 
		 103={soyisim=Yan, brans=C#, isim=Ali}, 
		 104={soyisim=Can, brans=QA, isim=Ayse}
		 }

		 
		 
		 
		 
		 */


}


