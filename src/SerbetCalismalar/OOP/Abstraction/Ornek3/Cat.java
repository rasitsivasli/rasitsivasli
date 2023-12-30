package SerbetCalismalar.OOP.Abstraction.Ornek3;

public class Cat extends BigCat {
    public static void main(String[] args) {

        Cat vanKedisi = new Cat();
        vanKedisi.getName();// Animal sinifindan
        vanKedisi.getNameAnimal();// Animal sinifindan

        vanKedisi.getCatName();// Override edilenler
        vanKedisi.getCatAge();//Override edilenler


    }


    @Override
    public void getCatName() {
        System.out.println("Cat class inda");

    }

    @Override
    public void getCatAge() {
        System.out.println("cAT CLASINDAN");

    }
}
