package Privat.DE28_Interface.Tasks.Task02;

public class ClassToyotaPrrius extends ClassVehicle implements Gas,Electric{
    public ClassToyotaPrrius() {
    }

    @Override
    public void changeBattary() {
        System.out.println("Toyota Battery metodu");
    }

    @Override
    public void changeOil() {
        System.out.println("Toyota changeOil calisti" );
    }

    public ClassToyotaPrrius(String model, int motor) {
        super(model, motor);
    }

    @Override
    public String toString() {
        return "ClassToyotaPrrius{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }
}
