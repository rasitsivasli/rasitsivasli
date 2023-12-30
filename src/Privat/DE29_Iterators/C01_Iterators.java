package Privat.DE29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan",
                "Ceren", "Tugba", "Taha", "Ismail", "Murat","Yahya","Hâle"));
        List<Integer> listInt = new ArrayList<>(Arrays.asList(4,2,6,11,7,43,2,8));
        Iterator<String> itr = list.iterator();
        Iterator<Integer> itrI = listInt.iterator();
        while (itr.hasNext()){ // .hasNext() metodu sağında eleman varsa true yok ise false dönderir
            System.out.print(itr.next()+","); // .next() metodu, sağdaki elemanı alır ve pointeri 1 ilerletir
        }
        itr = list.iterator(); // iterator u başa alır
        System.out.println();
       // itr.remove(); // pointerin solundaki elemanı siler

        System.out.println(list);

        System.out.println("bitti");
        while (itrI.hasNext()) {
            System.out.print(itrI.next()+",");
        }
        System.out.println("bitti 2");



    }
}
   /*
   index  desteklemeyen yapılarda(Collections) tekrarlayan(loop)  aksiynlar için for-each  loop update yapamayabilir(task04)
   Bu durmnda java iterator interface'den tanımlanacak variable ile tekrarlanması gereken aksiyonlar index olmadan tanımlanabilir.

        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanılır.
        Iterator itr =  liste.iterator();
        iterator collection'in ilk elementinin oncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext() ===> true  iterator'a yaninda eleman varlığını kontrol eder, true veya false return eder.

        itr.next(); ==> iterator bir sonraki elementin yanina geçirir.
                        ve uzerinden gectigi elementi return eder.
         [ 5, (itr)7, 8, 6, 9]   ===>  5 return eder.

         itr.next(); ==>

         [ 5, 7, (itr)8, 6, 9]   ===>  7 return eder.

         itr.remove(); // iterator'in elinde olan elementi sildi
         dolayisiyla ust uste iki kere itr.remove(); KULLANILAMAZ

         once itr.next(); methodunu calistirip
         iterator'in bir element return etmesi  saglanmalı..


ahan da trick --> hasPrevious() ve previous() method'larinin calimasi icin oncesinde
MUTLAKA KESİNLİKLE hasNext() ve next();method'lari calistirilarak cursor(pointer) en sona getirilmeli

"ITERATOR" ve "LISTITERATOR" arasi farklar :

1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini içerir.

2) "LISTITERATOR" sadece list'ler cin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir

3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.

 */