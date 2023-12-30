package Privat.DE26_Exception.j26_Exceptions.Tasks;

public class Ex05 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        try {
            System.out.println(5/0);//ArithmeticException
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
