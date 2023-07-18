package com.softserve.homework.homework7.task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("\tI'm driving!");
    }
}
