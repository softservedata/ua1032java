package com.softserve.edu.InterfacesPolymorphism;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int maxSpeed, int passengers) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
