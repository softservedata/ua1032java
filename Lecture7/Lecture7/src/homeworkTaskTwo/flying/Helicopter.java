package homeworkTaskTwo.flying;

import homeworkTaskTwo.flying.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void land() {
        System.out.println("The helicopter is landing!");
    }

    @Override
    void fly() {
        System.out.println("The helicopter is flying!");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
