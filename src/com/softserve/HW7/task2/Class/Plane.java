package com.softserve.HW7.task2.Class;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers,int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public Plane() {
        super();
    }
    @Override
    void fly() {

    }

    @Override
    void land() {
        System.out.println("");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
