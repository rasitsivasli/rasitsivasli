package Privat.DE27_Abstraction.abstract01;

public class Crv extends  Honda{


    @Override
    public void motor() {
        System.out.println("Agam 2.4 super turbo motor arazi bekler seni 4x4 ");
    }

    @Override
    void kapi() {
        System.out.println("Agam kapılar kale gibi ");
    }

    @Override
    void koltuk() {
        System.out.println("Agam deri koltuk arazide daha temiz");
    }
}
