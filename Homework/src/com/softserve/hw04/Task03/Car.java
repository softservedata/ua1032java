package com.softserve.hw04.Task03;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    Car(){
        type = "";
        yearOfProduction = 0;
        engineCapacity = 0;
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car { " + "Type = "
                + type + ", Year of production = "
                + yearOfProduction + ", Engine capacity = "
                + engineCapacity + " }";
    }
}
