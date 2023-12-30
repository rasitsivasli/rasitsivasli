package SerbetCalismalar.Map.EbobEkok;

public class Hesap {
    static int enBuyukOrtakBolen = 1;

    public static void ebob(EbobEkok obj1) {
        int min = Math.min(obj1.getA(), obj1.getB());

        for (int i = 1; i <= min; i++) {
            if (obj1.getA() % i == 0 && obj1.getB() % i == 0) {
                enBuyukOrtakBolen = i;
            }
        }
        System.out.println("enBuyukOrtakBolen = " + enBuyukOrtakBolen);
    }

    public static void ekok(EbobEkok obj1) {
        int enKucukOrtakKat;
        enKucukOrtakKat = obj1.getA() * obj1.getB() / enBuyukOrtakBolen;
        System.out.println("enKucukOrtakKat = " + enKucukOrtakKat);
    }

    public static void ekokIkinciYol(EbobEkok obj1) {
        int max = Math.max(obj1.getA(), obj1.getB());
        int ortakKat = max;
        for (int i = 1; i < max; i++) {
            ortakKat = ortakKat * i;
            if (ortakKat % obj1.getA() == 0 && ortakKat % obj1.getB() == 0) {
                System.out.println(ortakKat);
                break;
            }
        }
    }
}

