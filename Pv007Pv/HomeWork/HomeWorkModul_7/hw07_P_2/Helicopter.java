package hw07_P_2;

// Helicopter class represents a helicopter, which is a type of flying vehicle
public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    // Method to indicate that the helicopter is flying
    @Override
    public void Fly() {
        super.Fly();
        System.out.println(", namely on a helicopter");
    }

    // Method to indicate the maximum height and weight of the helicopter
    @Override
    public void Land() {
        super.Land();
        System.out.println("Maximum height: " + maxHeight + ", Weight: " + weight);
    }
}
