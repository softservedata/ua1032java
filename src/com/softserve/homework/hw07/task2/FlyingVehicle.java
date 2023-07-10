package com.softserve.homework.hw07.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle(){
    }
    public abstract void fly();
    public abstract void land();
}