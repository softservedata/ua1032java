package com.softserve.HomeWork.HW7.task2.Class;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public FlyingVehicle() {
        super();
    }

    abstract void fly();

    abstract void land();
}
