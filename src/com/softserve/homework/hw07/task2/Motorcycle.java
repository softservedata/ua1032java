package com.softserve.homework.hw07.task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    public Motorcycle(){
    }
    @Override
    public void drive() {
        System.out.println("Motorcycle can drive");
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}