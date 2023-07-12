package hw07_P_2;

/**
 *  2*. Create and test a program’s structure corresponding to the next schema
 * */
public class Passengers {
    int passengers;

    public Passengers() {
    }

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public static void main(String[] args) {
        // Creating objects of various classes
        Liner liner = new Liner(2000, 10);
        Boat boat = new Boat(50, 100);
        Plane plane = new Plane(150, 5000);
        Helicopter helicopter = new Helicopter(4, 200, 1000);
        Bus bus = new Bus(30, "Route A");
        Motorcycle motorcycle = new Motorcycle(1, 200);
        Car car = new Car(4, "Sedan");

        // Calling methods on objects
        liner.isSailing();
        boat.isSailing();
        plane.Fly();
        plane.Land();
        helicopter.Fly();
        helicopter.Land();
        bus.Drive();
        motorcycle.Drive();
        car.Drive();
    }
}
