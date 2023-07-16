package practical.lesson6.task2;

public class Truck extends Car{

    @Override
    public void run() {
        System.out.println("The truck " + model +
                           " is running at speed " + maxSpeed +
                           " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("The truck " + model +
                           " has stopped.");
    }

    public Truck(int yearOfProduction, int maxSpeed, String model) {
        super(yearOfProduction, maxSpeed, model);
    }

}
