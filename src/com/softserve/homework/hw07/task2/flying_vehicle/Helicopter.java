package com.softserve.homework.hw07.task2.flying_vehicle;

public class Helicopter extends FlyingVehicle{

    private int weight;
    private int maxWeight;

    public Helicopter(int passengers, int weight, int maxWeight) {
        super(passengers);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Helicopter flies in a short distances");
    }

    @Override
    public void land() {
        super.land();
        System.out.println("Helicopter uses land for landing and taking off");
    }

    @Override
    public String toString() {
        return "Helicopter : weight=" + weight +" maxWeight=" + maxWeight + super.toString();
    }
}
