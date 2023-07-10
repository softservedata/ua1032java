package com.softserve.homework.homework5.task3;

public class Car {
    private CarType type;
    private int year;
    private double engineCapacity;

    public Car() {
        type = null;
        year = 0;
        engineCapacity = 0.0;
    }
    public Car(CarType type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public CarType getType() {
        return type;
    }
    public void setType(CarType type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car { " +
                " type = " + type.getCarType() +
                ", year = " + year +
                ", engineCapacity = " + engineCapacity +
                " } ";
    }
}
