package practicalTaskTwo;

public abstract class Car {
    private String model;
    private double maxSpeed;
    private int yearOfProduction;

    public Car(String model, double maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public void run() {

    }
    public void stop() {

    }
}
