package com.softserve.practical.practical6.task1;

public class Truck extends Car {

    public Truck(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck started!");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped!");
    }
}
