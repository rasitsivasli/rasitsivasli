package SerbetCalismalar.OOP.Polymorpysim.Beispiel;

public class Book {
    String type = "Masal";
    String name ;
    public void sayfa(){
        System.out.println("Kitap 50 sayfa");
    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
