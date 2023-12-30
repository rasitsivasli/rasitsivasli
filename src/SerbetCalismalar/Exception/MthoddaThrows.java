package SerbetCalismalar.Exception;

public class MthoddaThrows {
    public void method1() throws InterruptedException {
        System.out.println("Method 1 calisti");
        Thread.sleep(110);
        System.out.println("Method 1 bitti");
    }

    public  void method2 () throws InterruptedException {
        method1();
    }
    public  void method3 () {
        try {
            method1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
