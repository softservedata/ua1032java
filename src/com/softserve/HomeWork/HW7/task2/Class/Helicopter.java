package com.softserve.HomeWork.HW7.task2.Class;

public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public Helicopter() {
        super();
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}
