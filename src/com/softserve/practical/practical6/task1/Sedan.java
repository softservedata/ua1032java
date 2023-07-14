package com.softserve.practical.practical6.task1;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan started!");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped!");
    }
}
