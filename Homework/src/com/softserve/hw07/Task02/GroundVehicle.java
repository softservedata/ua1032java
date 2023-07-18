package com.softserve.hw07.Task02;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
