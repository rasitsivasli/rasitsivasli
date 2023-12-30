package Privat.DE25_InHeritance.task01;

public class Cocuk extends Baba {

    private String tc = "987654321";

    public void minecraft() {
        System.out.println("Cok iyi oyun oynar");
    }

    public Cocuk() {
        super("ali");
        System.out.println("Cocuk cons. calisti");
        System.out.println("Baba Tc en son= " + super.getTc());
    }
}
