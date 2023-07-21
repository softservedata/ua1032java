package com.softserve.Homework.hw_7.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {}

    @Override
    public void fly() {
        System.out.println("\tPlane is flying");
    }

    @Override
    public void land() {
        System.out.println("\tPlane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

