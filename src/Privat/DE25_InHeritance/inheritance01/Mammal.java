package Privat.DE25_InHeritance.inheritance01;

public class Mammal extends Hayvancik {//Hayvancık parent Class'ın Child class


    public Mammal() {//P'siz cons
        System.out.println("Agam P'siz MAMMAL cons call edildi..");
    }
    public void sutBeslen() {
        System.out.println("bebeleri SUT ile besler");
    }
    public  void dogum() {
        System.out.println("nur topu gibi yavrısı olur ");
    }
}
