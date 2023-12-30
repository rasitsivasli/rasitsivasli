package Privat.DE27_Abstraction.abstract05;

public class Kartal extends Hayvan {

    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("günde 1 kuş");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
