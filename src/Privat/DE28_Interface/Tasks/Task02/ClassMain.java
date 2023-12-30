package Privat.DE28_Interface.Tasks.Task02;

import java.util.ArrayList;

public class ClassMain {
    public static void main(String[] args) {
        ClassTeslaCar tesla = new ClassTeslaCar("X", 3);
        ClassToyotaPrrius prius = new ClassToyotaPrrius("Prius", 2);
        ClassBus bus = new ClassBus("Travego", 5);
        ArrayList<Object> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(prius);
        cars.add(bus);
        for (int i = 0; i < 3; i++) {
            System.out.println(cars.get(i));
        }
        tesla.changeBattary();
        prius.changeBattary();
        prius.changeOil();
        bus.changeDiesel();
    }
}
