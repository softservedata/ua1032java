package secondHomeWork.groundVehicle;

import secondHomeWork.Passengers;
import secondHomeWork.Vehicle;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    public void drive(){}
}
