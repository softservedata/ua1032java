package com.softserve.Practicaltask02_OOP_part01;

abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan has stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Truck("Truck A", 120, 2015);
        cars[1] = new Sedan("Sedan X", 180, 2020);
        cars[2] = new Truck("Truck B", 100, 2018);

        for (Car car : cars) {
            System.out.println("Model: " + car.model);
            System.out.println("Max Speed: " + car.maxSpeed);
            System.out.println("Year of Production: " + car.yearOfProduction);
            car.run();
            car.stop();
            System.out.println();
        }
    }
}