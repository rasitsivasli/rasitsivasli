package Privat.DE31_Maps.KonuAnlatim;

import java.util.Hashtable;

public class C12_HashTable {
     /*
        HashTable ->
        HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez.
        4-HashTable eleman ataması yapılırken  HashMap gibi random(rastgele: hurra )  yapar.
         */
     public static void main(String[] args) {
         Hashtable<String, String> hm = new Hashtable<>();//bos hm tanımlandı

         hm.put("Amazon", "296 Euro");
         hm.put("Saturn", "200 Euro");
         hm.put("Vatan", "111 Euro");
         hm.put("Apple", "450 Euro");
         hm.put("Teknosa", "333 Euro");
         hm.put("Media Markt", "");
         System.out.println(hm);

         for (String key : hm.keySet()){
             System.out.println(key+", "+ hm.get(key));
         }

     }

}
