package SerbetCalismalar.OOP.Encaputilation;

public class Runner {
    public static void main(String[] args) {
        BookOrder bo = new BookOrder();// obtain an arbitrary order
        System.out.println("bo.getItems() = " + bo.getItems());
        bo.getItems().add("asas");

        System.out.println("bo.getItems() = " + bo.getItems());
    }

}
