package com.softserve.Practical.P6.task2;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public Sedan() {
        super();
    }

    @Override
    public String toString() {
        return "\nSedan" + super.toString();
    }

}
