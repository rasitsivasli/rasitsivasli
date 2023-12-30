package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task17_Scope_Calisma {
    static int sayi = 5;
    String ders = "Java";

    public static void main(String[] args) {
        staticMetod();


    }

    public static void staticMetod() {
        sayi = 10;//static variable heryerden ulasilabilir
        System.out.println("sayi = " + sayi);
        //ders = "fizik"; instance variable a sadece static olmayan metodlardan ulasilabilir
        Task17_Scope_Calisma obj = new Task17_Scope_Calisma();
        System.out.println("obj.ders = " + obj.ders);//
        obj.staticOlmayanMetod();
    }

    public void staticOlmayanMetod() {
        ders = "Fizik";
        System.out.println("ders = " + ders);
    }
}
