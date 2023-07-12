package hw07_P_2;


// FlyingVehicle class represents a flying vehicle and extends the Passengers class while implementing the Vehicle interface
public class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    // Method to indicate that the vehicle is flying
    public void Fly() {
        System.out.print("Travel by flying vehicle");
    }

    // Method to indicate the flight range of the vehicle
    public void Land() {
        System.out.println("Flight range");
    }
}
