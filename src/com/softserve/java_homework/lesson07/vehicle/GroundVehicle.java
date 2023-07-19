package com.softserve.java_homework.lesson07.vehicle;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}