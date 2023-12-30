package SerbetCalismalar.Exception;

public class MultiTry {
    public static void main(String[] args) {
        String s = null;
        int x = 12;
        int y = 0;

        try {
            System.out.println("s.length() = " + s.length());
            System.out.println("x/y = " + x / y);

        } catch (NullPointerException e) {
            System.out.println("Null Pointer hata yakalandi");
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata yakalandi");
        } finally {
            System.out.println("Finally blogu calisti");
        }
    }
}
