package SerbetCalismalar.Exception;

public class Checked {
    public static void main(String[] args) {
        System.out.println("Test 1 baslasin");

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\rsn "+i);
        }

        System.out.println("Test tamamlandi");


    }
}
