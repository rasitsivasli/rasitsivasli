package SerbetCalismalar.OOP.Polymorpysim.Beispiel;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book();// Book sinifindaki obje
        book1.name="Seyir";
        book1.sayfa();
        System.out.println("book1 = " + book1);

        Rapunzel rapunzel = new Rapunzel();
        rapunzel.name="Rapunzel";
        rapunzel.yazar="Rasit";
        rapunzel.sayfa();
        rapunzel.sayfa(12);//
        System.out.println("rapunzel = " + rapunzel);

        Book pinokyo = new Rapunzel();
        pinokyo.sayfa();

        Rapunzel peter = (Rapunzel) new Book();
        peter.sayfa();





    }
}
