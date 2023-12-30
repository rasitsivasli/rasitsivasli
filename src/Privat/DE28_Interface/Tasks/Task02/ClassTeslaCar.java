package Privat.DE28_Interface.Tasks.Task02;

public class ClassTeslaCar extends ClassVehicle implements Electric{

    @Override
    public void changeBattary() {
        System.out.println("Tesla Battery metodu");
    }

    public ClassTeslaCar() {
    }

    public ClassTeslaCar(String model, int motor) {
        super(model, motor);
    }

    @Override
    public String toString() {
        return "ClassTeslaCar{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }

}
