package homeworkTaskTwo.water;

import homeworkTaskTwo.Passengers;
import homeworkTaskTwo.Vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public WaterVehicle() {
        super();
    }

    abstract void isSailing();
}
