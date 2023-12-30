package SerbetCalismalar.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Beispiel {
    public static void main(String[] args) {
        String str = "nasilsin";

        Integer [] arr = new Integer[]{1,2,3};
        int [] arr2 = new int[4];
        ArrayList<String> list = new ArrayList<>(Arrays.asList("as","ma","di"));
        list.add("selim");
        list.add(2,"veli");
        list.set(2,"kemal");
        System.out.println("list = " + list);
        System.out.println("list.indexOf(\"kemal\") = " + list.indexOf("kemal"));
        Stack<String> stack = new Stack<>();
        stack.addLast("eleman");
        System.out.println("stack = " + stack);
    }
}
