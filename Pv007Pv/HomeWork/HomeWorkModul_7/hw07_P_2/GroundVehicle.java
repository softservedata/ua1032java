package hw07_P_2;

// GroundVehicle class represents a ground-based vehicle and extends the Passengers class while implementing the Vehicle interface
public class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    // Method to indicate that the vehicle is driving
    public void Drive() {
        System.out.print("Travel by ground vehicle");
    }
}
