package homework.lesson7.task2;

public class PassengersApp {
    public static void main(String[] args) {
        WaterVehicle liner = new Liner(200, 4);
        WaterVehicle boat = new Boat(10, 25);
        FlyingVehicle plane = new Plane(200, 700);
        FlyingVehicle helicopter = new Helicopter(5, 4, 3);
        GroundVehicle bus = new Bus(40, "Bus Station");
        GroundVehicle motorcycle = new Motorcycle(2, 320);
        GroundVehicle car = new Car(5, "Mercedes");
        liner.isSailing();
        boat.isSailing();
        plane.fly();
        plane.land();
        helicopter.fly();
        helicopter.land();
        bus.drive();
        motorcycle.drive();
        car.drive();
    }
}
