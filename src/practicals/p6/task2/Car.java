package practicals.p6.task2;

public abstract class Car {
    private String model;
    private  int maxSpeed;
    private int yearOfProduction;


    abstract void run();
    abstract void stop();

    public Car ( ) {

    }

    public Car ( String model, int maxSpeed, int yearOfProduction ) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;

    }

    @Override
    public String toString () {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getModel () {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public void setMaxSpeed ( int maxSpeed ) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction () {
        return yearOfProduction;
    }

    public void setYearOfProduction ( int yearOfProduction ) {
        this.yearOfProduction = yearOfProduction;
    }
}
