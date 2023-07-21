package com.softserve.HomeWork.HW7.task2.Class;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    public GroundVehicle() {
        super();
    }
    abstract void drive();
}
