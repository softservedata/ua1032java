package com.softserve.HomeWork.HW7.task2.Class;

public class Car extends GroundVehicle {
    String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public Car() {
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("The car is going");
    }
}
