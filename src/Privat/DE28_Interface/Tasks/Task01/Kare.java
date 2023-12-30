package Privat.DE28_Interface.Tasks.Task01;

public class Kare implements Interface {
    @Override
    public void cevre() {
        System.out.println("KareninCevresi : "+kareninKenari*4);
    }
    @Override
    public void alan() {
        System.out.println("KareninAlani : "+ kareninKenari*kareninKenari);
    }
}
