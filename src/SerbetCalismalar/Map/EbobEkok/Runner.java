package SerbetCalismalar.Map.EbobEkok;

public class Runner {
    public static void main(String[] args) {
        EbobEkok obj1 = new EbobEkok();
        obj1.setA(24);
        obj1.setB(36);

        Hesap.ebob(obj1);
        Hesap.ekok(obj1);
        Hesap.ekokIkinciYol(obj1);
    }
}
