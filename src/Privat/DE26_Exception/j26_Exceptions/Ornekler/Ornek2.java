package Privat.DE26_Exception.j26_Exceptions.Ornekler;

public class Ornek2 {
    public static void main(String[] args) {
        int a = 5;
        try {
            a=a/(a-5);
        } catch (Exception e) {
            System.out.println(e); //throw new RuntimeException(e);
            System.out.println("a = " + a);
        }

    }
}
