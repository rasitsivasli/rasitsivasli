package _____OSA_____.BOZ_OSA.s21_s30.s28_lists;

public class List04 {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};// Array direkt toplu olarak Arrays.asList metodu olmadan list eye dönüsmez
       // List<String> list = names.asList();// list.set(0, "Sue");
        System.out.println(names[0]);// Eger önce array liste ye cevrilirse list de yaptigimiz degisikler array i da etkiler
        
        /*
        A. Sue
        B. Tom
        C. 8. Satirdan dolayi kod calismaz.
        D. 9. Satirdan dolayi kod calismaz.
        E. Kod exception olusturur.

         */
    }
}
