package homeworkTaskTwo.ground;

import homeworkTaskTwo.ground.GroundVehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

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

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    void drive() {
        System.out.println("The motorcycle is driving!");
    }
}
