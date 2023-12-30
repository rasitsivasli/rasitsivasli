package Privat.DE27_Abstraction.abstract_01;

public class Civic extends Lastik{

    @Override
    public void motor() {
        System.out.println("civic motor");
    }

    @Override
    void kapi() {
        System.out.println("civic kapi");
    }

    @Override
    void koltuk() {
        System.out.println("civic koltuk");
    }

    @Override
    public void lastikEbat() {
        System.out.println("civic lastik ebat");
    }
}
