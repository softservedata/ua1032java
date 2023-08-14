package com.softserve.edu.InterfacesPolymorphism;

public abstract class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
