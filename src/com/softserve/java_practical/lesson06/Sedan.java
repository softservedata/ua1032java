package com.softserve.java_practical.lesson06;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + getModel() + " " + getYearOfProduction() + " with max speed " + getMaxSpeed() + " km/h started and is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getModel() + " " + getYearOfProduction() + " is stopped");
    }
}