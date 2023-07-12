package com.softserve.homework.hw07.task2.flying_vehicle;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Plane is flying in a long distances");
    }

    @Override
    public void land() {
        super.land();
        System.out.println("Plane uses land for taking off in a high speed");
    }

    @Override
    public String toString() {
        return "Plane: maxDistance = " + maxDistance + super.toString();
    }
}
