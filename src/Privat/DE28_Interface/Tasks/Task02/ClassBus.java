package Privat.DE28_Interface.Tasks.Task02;

public class ClassBus extends ClassVehicle implements Diesel {
    @Override
    public void changeDiesel() {
        System.out.println("Bus diesel metodu");
    }

    public ClassBus() {
    }

    public ClassBus(String model, int motor) {
        super(model, motor);
    }

    @Override
    public String toString() {
        return "ClassBus{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }
}
