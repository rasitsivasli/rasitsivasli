package Privat.DE28_Interface.Tasks.Task01;

public class Daire implements Interface {
    @Override
    public void cevre() {
        System.out.println("Dairenin Cevresi : "+(2*3.14*daireninYaricapi));
    }

    @Override
    public void alan() {
        System.out.println("Dairenin Cevresi : "+(3.14*daireninYaricapi*daireninYaricapi));
    }
}
