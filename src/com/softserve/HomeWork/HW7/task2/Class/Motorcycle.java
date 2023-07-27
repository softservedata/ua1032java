package com.softserve.HomeWork.HW7.task2.Class;

public class Motorcycle extends GroundVehicle {
    int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle() {
        super();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("The motorcycle is going");
    }
}
