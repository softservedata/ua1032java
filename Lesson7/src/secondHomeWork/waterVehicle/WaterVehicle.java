package secondHomeWork.waterVehicle;

import secondHomeWork.Passengers;
import secondHomeWork.Vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public void isSailing(){
    }
}
