package com.softserve.lesson06.pt06.task02;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
        System.out.println("Class Truck constructor\n");
    }
}
