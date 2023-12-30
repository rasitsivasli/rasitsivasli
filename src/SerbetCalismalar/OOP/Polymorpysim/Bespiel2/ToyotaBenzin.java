package SerbetCalismalar.OOP.Polymorpysim.Bespiel2;

public class ToyotaBenzin extends Toyota {
    public static void motor(){
        System.out.println("Toyota 1.4 motor");
    }
    public static void yakit(){
        System.out.println("Toyota benzinli araclarda E10 benzin kullanilir");
    }
    void motor(Double maxTuketim){
        System.out.println("Toyota ortalama 6.8 lt yakit tüketir");
        if (maxTuketim>6.8){
            System.out.println("Benzinli toyota alabilirisniz");
        }else {
            System.out.println("Isteginize uygun benzinli yok");
        }
    }

}
