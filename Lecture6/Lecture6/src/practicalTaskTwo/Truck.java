package practicalTaskTwo;

public class Truck extends Car {
    public Truck(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }
    public void run() {
        System.out.println("~The truck is running. ");
    }
    public void stop() {
        System.out.println("~The truck has stopped.");
    }
}
