package practicalTaskTwo;

public class Sedan extends Car{
    public Sedan(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }
    public void run() {
        System.out.println("~The sedan is running. ");
    }
    public void stop() {
        System.out.println("~The sedan has stopped.");
    }
}
