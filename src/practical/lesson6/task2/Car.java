package practical.lesson6.task2;

public abstract class Car {
    protected int yearOfProduction;
    protected int maxSpeed;
    protected String model;

    public abstract void run();
    public abstract void stop();

    public Car(int yearOfProduction, int maxSpeed, String model) {
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
