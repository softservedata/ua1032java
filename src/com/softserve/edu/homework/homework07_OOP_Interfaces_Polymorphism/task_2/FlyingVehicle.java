package com.softserve.edu.homework.homework07_OOP_Interfaces_Polymorphism.task_2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    FlyingVehicle(int passengers){
        super(passengers);
    }
    public void fly(){
    }
    public void land(){
    }

}
