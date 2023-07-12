package hw07_P_2;

// Plane class represents a plane, which is a type of flying vehicle
public class Plane extends FlyingVehicle {
    int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    // Method to indicate that the plane is flying
    @Override
    public void Fly() {
        super.Fly();
        System.out.println(", namely on a plane");
    }

    // Method to indicate the flight range of the plane
    @Override
    public void Land() {
        super.Land();
        System.out.println("Flight range" + maxDistance);
    }
}


