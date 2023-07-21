package com.softserve.Homework.hw_7.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car() {
    }

    @Override
    public void drive() {
        System.out.println("\tCar is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}