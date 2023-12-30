package SerbetCalismalar.OOP.Abstraction.Ornek1;

public class Accord extends Honda{

    public Accord() {
    }

    @Override
    public void motor() {
        System.out.println("accor motor calisti");

    }

    @Override
    public String toString() {
        return "Accord{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    void kapi() {
        System.out.println("Accord kapi");
    }

    @Override
    void koltuk() {

    }


}
