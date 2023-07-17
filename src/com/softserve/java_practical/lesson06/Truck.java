package com.softserve.java_practical.lesson06;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck " + getModel() + " " + getYearOfProduction() + " with max speed " + getMaxSpeed() + " km/h started and is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + getModel() + " " + getYearOfProduction() + " is stopped");
    }
}