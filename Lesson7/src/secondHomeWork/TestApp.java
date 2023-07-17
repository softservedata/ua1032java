package secondHomeWork;

import secondHomeWork.flyingVehicle.Helicopter;
import secondHomeWork.flyingVehicle.Plane;
import secondHomeWork.groundVehicle.Bus;
import secondHomeWork.groundVehicle.Car;
import secondHomeWork.groundVehicle.Motorcycle;
import secondHomeWork.waterVehicle.Boat;
import secondHomeWork.waterVehicle.Liner;

public class TestApp {
    public static void main(String[] args) {

        Vehicle[] vehicles=new Vehicle[7];
        vehicles[0]=new Liner(300,4);
        vehicles[1]=new Boat(300,20);
        vehicles[2]=new Plane(100,2000);
        vehicles[3] = new Helicopter(10, 200, 1200);
        vehicles[4] = new Bus(22, "Bus1");
        vehicles[5] = new Motorcycle(2, 300);
        vehicles[6] = new Car(5, "Car1");


        for (var vehicle: vehicles) {
            System.out.println(vehicle.toString());
        }

    }
}
