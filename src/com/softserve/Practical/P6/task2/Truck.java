package com.softserve.Practical.P6.task2;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }
    public Truck() {
        super();
    }
    public String toString() {
        return "Truck" + super.toString();
    }
}
