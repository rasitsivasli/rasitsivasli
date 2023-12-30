package Privat.DE25_InHeritance.task02;
/*

1) SuperClass  bir class create ediniz.  int sayi  = 33    variable create ediniz.
ebikGabik method   "Agama bolcana super offer" return ediniz

2) SubClass SuperClass'tan inherit ediniz.    int sayi= 17 variable create ediniz.
ebikGabık methodu  "Agam SubClass'dan selam dewamkeee. "  return ediniz

javaCAN  method create edip : SubClass'daki ebikGabık methodunu ve SuperClasstaki ebikGabık
methodunu call edip SubClass  ve SuperClass'taki int sayi print ediniz.

sonra olarak main methodta  javaCAN u call ediniz..


output:

"Agama bolcana super offer"
"Agam SubClass'dan selam dewamkeee. "
SubClasstaki sayi :33
süperClasstaki sayi  :17
*/
public class Runner {
    public static void main(String[] args) {
      SubClass subClass = new SubClass();
        System.out.println(subClass.ebikGabik());

    }

}
