package com.softserve.lesson06.pt06.task02;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
        System.out.println("Abstract class Car constructor");
    }

    @Override
    public String toString() {
        return  "model = '" + model + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", yearOfProduction = " + yearOfProduction;
    }

    public void run() {
        System.out.println("You are initializing method run() of " + this.model);
    }

    public void stop() {
        System.out.println("You are initializing method stop() of " + this.model);
    }
}
