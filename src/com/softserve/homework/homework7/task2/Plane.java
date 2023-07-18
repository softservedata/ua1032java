package com.softserve.homework.homework7.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {}

    @Override
    void fly() {
        System.out.println("\tI'm flying");
    }

    @Override
    void land() {
        System.out.println("\tI landed!");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
