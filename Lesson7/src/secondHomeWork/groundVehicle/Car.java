package secondHomeWork.groundVehicle;

public class Car extends GroundVehicle{
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Drive car");
    }

    @Override
    public String toString() {
        return "Car : " + "model=" + model +";"+super.toString();

    }
}
