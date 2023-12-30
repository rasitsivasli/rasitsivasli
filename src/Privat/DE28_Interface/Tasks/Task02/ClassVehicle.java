package Privat.DE28_Interface.Tasks.Task02;

public class ClassVehicle {
    String model;
    int motor;

    public ClassVehicle(String model, int motor) {
        this.model = model;
        this.motor = motor;
    }

    public ClassVehicle() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}
