package SerbetCalismalar.OOP.Polymorpysim.Bespiel2;

public class CarSeller {
    public static void main(String[] args) {
        CarSeller obj1 = new CarSeller();
        obj1.yakit(2020);
        obj1.yakit(2.5);

    }
    public void motor(){
        System.out.println("Müsteri nasil motor isterse, bluruz");
    }
    public void yakit(){
        System.out.println("Müsteri nasil yakit isterse, bluruz");
    }
    public void yakit(double maxTuketim){
        System.out.println("Istediginiz "+maxTuketim+ " lt tüketim arac buluruz");
    }
    public void yakit(int yil){
        System.out.println("Itediginiz model yili" + yil +" bulunur");
    }
}
