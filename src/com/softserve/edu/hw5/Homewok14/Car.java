package com.softserve.edu.hw5.Homewok14;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    Car(String type, int yearOfProduction, double engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
    public int getYear(){
        return yearOfProduction;
    }




    @Override
    public String toString() {
        return "Car[" +
                "type = '" + type + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", engineCapacity = " + engineCapacity +
                ']';
    }
}
