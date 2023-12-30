package Privat.DE28_Interface.Tasks.Task03;

import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        double hesap= 0;
        AdanaKebab kebab = new AdanaKebab();
        Lahmacun lahmacun = new Lahmacun();
        Borsh borch = new Borsh();
        Palov palov = new Palov();
        String secim = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                                    Menu :\s
                    Adana Kebab : Marinade = 20 Euro, Grill = 25 Euro\s                    
                    Lahmacun    : Dough = 4 Euro, Topping = 5 Euro, Bake = 6 Euro\s
                    Borsh       : 8 Euro
                    Palov       : Fry = 3 Euro, Boil= 4 Euro
                    
                    Siparisiniz tamamlandiysa Tamam i seciniz : """);
            secim = scanner.next();
            switch (secim){
                case "marinade" : hesap+=20; break;
                case "grill"    : hesap+=25; break;
                case "dough"    : hesap+=4;  break;
                case "topping"  : hesap+=5;  break;
                case "bake"     : hesap+=6;  break;
                case "borsh"    : hesap+=8;  break;
                case "fry"      : hesap+=3;  break;
                case "boil"     : hesap+=4;  break;

            }

        } while (!secim.equalsIgnoreCase("Tamam"));
        System.out.println("hesap = " + hesap);
    }
}
