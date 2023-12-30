package Privat.DE26_Exception.j26_Exceptions.Tasks.Task05.KendiCozumum;

public class Main {
    static void randomMethos() {
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);

        try {
            if (random1 + random2< 12) throw new Exception();
        } catch (Exception e) {
            System.out.println("Toplam 12'den küçük ise hata verir");
        }
        System.out.println("toplam = " + random1 + random2);
    }

    public static void main(String[] args) {

        randomMethos();
    }
}
