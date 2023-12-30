package SerbetCalismalar.OOP.Encaputilation;

import java.util.ArrayList;
import java.util.List;

public class BookOrder {
    private int id;
    private List<String> items = new ArrayList<>();

    public BookOrder() {
    }
    public int getId() {
        return id;
    }
    public List<String> getItems() {
        return items;
    }
    public String toString() {
        return String.valueOf(id) + " " + items;
    }
    }

