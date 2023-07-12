package homeWork_7_OOP_Part_2.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();
    public abstract void land();

}
