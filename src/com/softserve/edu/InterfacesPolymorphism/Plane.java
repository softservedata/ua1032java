package com.softserve.edu.InterfacesPolymorphism;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int maxDistance,int passengers) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying");
    }

    @Override
    public void land() {
        System.out.println("The plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
