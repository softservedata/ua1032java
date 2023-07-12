package homeWork_7_OOP_Part_2.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle {


    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
