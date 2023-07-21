package com.softserve.Homework.hw_7.task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {}

    @Override
    public void drive() {
        System.out.println("\tMotorcycle is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

