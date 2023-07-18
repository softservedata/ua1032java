package com.softserve.hw07.Task02;

public abstract class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();

    public abstract void land();
}
