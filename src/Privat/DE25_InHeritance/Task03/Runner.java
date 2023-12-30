package Privat.DE25_InHeritance.Task03;

public class Runner {
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen("Matematik",10);
        System.out.println("ogretmen = " + ogretmen);

        Ogretmen ogretmen2 = new Ogretmen(12,"agmet",25,"fiz",15);
        System.out.println("ogretmen2 = " + ogretmen2);

        Ogrenci ogrenci = new Ogrenci(12,"sami",25,10,563);
        System.out.println("ogrenci = " + ogrenci);
        ogrenci.setKimlikNo(123456);
        System.out.println("ogrenci.getKimlikNo() = " + ogrenci.getKimlikNo());


    }
}
