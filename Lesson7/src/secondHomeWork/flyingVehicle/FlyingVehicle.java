package secondHomeWork.flyingVehicle;

import secondHomeWork.Passengers;
import secondHomeWork.Vehicle;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {

    }
    public void land(){

    }
}
