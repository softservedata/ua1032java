package com.softserve.HW7.task2.Class;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public WaterVehicle() {
        super();
    }
    abstract void isSailing();
}
