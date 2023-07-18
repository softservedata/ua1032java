package com.softserve.homework.homework7.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("\tI'm driving!");
    }
}
