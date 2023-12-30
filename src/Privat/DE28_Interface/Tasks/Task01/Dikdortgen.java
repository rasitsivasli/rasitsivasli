package Privat.DE28_Interface.Tasks.Task01;

public class Dikdortgen implements Interface{
    @Override
    public void cevre() {
        System.out.println("Dikdörtgenin Cevresi : "+(dikdortgeninKisaKenari+dikdortgeninUzunKenari)*2);
    }

    @Override
    public void alan() {
        System.out.println("Dikdörtgenin Alani : "+(dikdortgeninKisaKenari*dikdortgeninUzunKenari));
    }
}
