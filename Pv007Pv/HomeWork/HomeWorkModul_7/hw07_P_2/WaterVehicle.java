package hw07_P_2;

// WaterVehicle class represents a water-based vehicle and extends the Passengers class while implementing the Vehicle interface
public class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    // Method to indicate that the vehicle is sailing
    public void isSailing() {
        System.out.print("Travel by water vehicle");
    }
}