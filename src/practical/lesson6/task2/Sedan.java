package practical.lesson6.task2;

public class Sedan extends Car{

    @Override
    public void run() {
        System.out.println("The car " + model +
                           " is running at speed " + maxSpeed +
                           " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("The car " + model +
                           " has stopped.");
    }

    public Sedan(int yearOfProduction, int maxSpeed, String model) {
        super(yearOfProduction, maxSpeed, model);
    }
}
