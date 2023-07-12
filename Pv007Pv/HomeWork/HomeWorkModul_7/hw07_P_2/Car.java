package hw07_P_2;

// Car is a subclass of GroundVehicle
public class Car extends GroundVehicle {
    String model;

    public Car(String model) {
        this.model = model;
    }

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

    // Method to indicate driving a car and specify the model
    @Override
    public void Drive() {
        super.Drive();
        System.out.println(", namely on the car: " + model);
    }
}
