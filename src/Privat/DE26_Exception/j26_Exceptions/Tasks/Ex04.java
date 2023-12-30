package Privat.DE26_Exception.j26_Exceptions.Tasks;

public class Ex04 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        Object obj = "10";
        int num =  Integer.parseInt(obj.toString());
        System.out.println(num);//ClassCastException
        
    }
}
