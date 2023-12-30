package SerbetCalismalar.OOP.Abstraction.Ornek1;

public abstract class Honda {// indem man Abstrackt schreib, erstellt man ein Abstrackt Class
    String name ;
    public abstract void motor();

    void sunroof() {
        System.out.println("sunroof metodu calisti");
    }
  abstract void kapi();
  abstract void koltuk();
}
