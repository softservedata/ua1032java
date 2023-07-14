package com.softserve.practical.practical6.task1;

public abstract class Car {
    private String model;
    private double maxSpeed;
    private int yearOfProduction;

    public Car(String model, double maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "\tCar { " +
                " model = '" + model + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", yearOfProduction = " + yearOfProduction +
                " }";
    }
}
