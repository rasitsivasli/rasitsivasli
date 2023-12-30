package Privat.DE25_InHeritance.inheritance01;

public class Kedi extends Mammal {//Mammal parent Classın child Classı
    public Kedi() {//P'siz child cons.
        System.out.println("Agam P'siz KEDİ cons call edildi..");
    }
    public  void cirmala(){
        System.out.println("Agam asil kedi fena cırmalar:)");
    }

}
