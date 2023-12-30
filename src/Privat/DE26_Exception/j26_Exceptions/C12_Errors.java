package Privat.DE26_Exception.j26_Exceptions;


public class C12_Errors {

    public static void main(String[] args) {

        //System.out.println(20/0);  // RTE-> RunTimeException

        //String str = "asd;  // CTE -> " eksik

        // Error -> handle edilemeyen cheked, code ile  çözülemeyen sistemden kaynaklı buyuk hatalardır.

        // Errorlar unchecked'dır ve öngörülemezler ancak gerçekleştiğinde  app. çalışması durdurulur.


        String str="";
        for (int i = 0; i < 10000000 ; i++) {
            str+=i;

        }

    }
}
