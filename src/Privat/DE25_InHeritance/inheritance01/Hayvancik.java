package Privat.DE25_InHeritance.inheritance01;

public class Hayvancik {//Grand Parent super Class-> dede


    public Hayvancik() {//P'siz super cons.
        System.out.println("Agam P'siz HAYVANCIK cons call edildi..");
    }
    public void hareket( ){
        System.out.println("HAYVANCIK hareket eder ");
    }
    public  void beslen(){
        System.out.println("HAYVANCIK fena  beslenir ");
    }
    public  void icme(){
        System.out.println("HAYVANCIK fena içer ");
    }
}
