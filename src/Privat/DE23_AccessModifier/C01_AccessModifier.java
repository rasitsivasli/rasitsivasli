package Privat.DE23_AccessModifier;

public class C01_AccessModifier {
    /*
             1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
                Diğer class'lardan "private" class member'lara erişilemez

             2) Diğer package'lerden   olusturulan object için class'i import edilmeli

             3) Diğer package'lerden default class memberlara erişilemez.
               "default"  "package private" sağlar

             4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
              için : a)Child class erişebilir. 	b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
              Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.
Özet
private, sadece aynı class dan erişilir
protected veya defult , aynı paket ten erişilebilir
public aynı projeden erişilebilir

     */

    public static void main(String[] args) {
        Example obj = new Example();
        Example obj2 = new Example();
        obj.sayi_default=10;
        obj.sayi_public=5;
        System.out.println(obj2);

    }


}
