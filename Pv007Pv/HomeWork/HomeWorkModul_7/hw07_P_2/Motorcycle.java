package hw07_P_2;


// Motorcycle is a subclass of GroundVehicle
public class Motorcycle extends GroundVehicle {
    int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Method to indicate driving a motorcycle and specify the maximum speed
    @Override
    public void Drive() {
        super.Drive();
        System.out.println(" maximum speed of the motorcycle: " + maxSpeed);
    }
}