package SerbetCalismalar.OOP.Abstraction.Ornek1;


public class Runner {
    public static void main(String[] args) {
        Civic civic = new Civic();
        civic.motor();
        Accord accord = new Accord();
        accord.kapi();
        civic.name="crv";
        System.out.println("civic.name = " + civic.name);
        accord.name="3 Motor";
        System.out.println("accord.name = " + accord.name);
        System.out.println("accord = " + accord);
        accord.motor();
    }
}
