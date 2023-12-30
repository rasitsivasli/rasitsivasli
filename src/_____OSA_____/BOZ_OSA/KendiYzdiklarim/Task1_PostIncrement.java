package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task1_PostIncrement {
    public static void main(String[] args) {
        int num1 = 9;
        // pre(once) Incerement once arttirmak demektir, post(sonra) Incerement sonra arttir demektir...
        int num2 = num1++;// num2 =9 dir . Neden ? Buarada önce atama yapilir
                          // sonra arttirma yapilir.
                          // ++num1 olsa idi önce arttirma sonra atma yapilacakti num2 = 10 olurdu
        System.out.println("num2 = " + num2);    // sonuc 9


        if (num2 < 10) System.out.println(num2 + " Hello World"); // 9 Hello Universel
        else           System.out.println(num1 + " Hello Universel");


    }
}
