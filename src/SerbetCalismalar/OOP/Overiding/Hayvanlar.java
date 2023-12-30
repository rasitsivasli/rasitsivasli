package SerbetCalismalar.OOP.Overiding;

public class Hayvanlar {

    protected boolean gorurMu=true;
    private void ureme(){
        System.out.println("Tüm hayvanlar üreyerek cogalir");
    }
    protected void beslenme(){
        System.out.println("Tüm hayvanlar beslerir");
    }

    protected void hareket(){
        System.out.println("Tüm hayvanlar hareket eder");
    }
    protected void solunum(){
        System.out.println("Tüm hayvanlar solunum yapar");
    }
}
