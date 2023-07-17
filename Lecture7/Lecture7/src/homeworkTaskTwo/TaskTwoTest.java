package homeworkTaskTwo;

/* Create and test a program’s structure corresponding to the next schema. */

import homeworkTaskTwo.flying.Helicopter;
import homeworkTaskTwo.flying.Plane;
import homeworkTaskTwo.ground.Bus;
import homeworkTaskTwo.ground.Car;
import homeworkTaskTwo.ground.Motorcycle;
import homeworkTaskTwo.water.Boat;
import homeworkTaskTwo.water.Liner;

public class TaskTwoTest {
    public static void main(String[] args) {
        Vehicle[] vehs = new Vehicle[7];
        vehs[0]=new Liner(200,4);
        vehs[1]=new Boat(150,34);
        vehs[2]=new Plane(87,8000);
        vehs[3] = new Helicopter(6, 900, 3200);
        vehs[4] = new Bus(33, "Bus#1");
        vehs[5] = new Motorcycle(1, 220);
        vehs[6] = new Car(6, "Tesla");
        for (var vehicle: vehs) {
            System.out.println(vehicle.toString());
        }
    }
}
