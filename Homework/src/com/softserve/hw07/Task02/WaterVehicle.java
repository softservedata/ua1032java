package com.softserve.hw07.Task02;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
