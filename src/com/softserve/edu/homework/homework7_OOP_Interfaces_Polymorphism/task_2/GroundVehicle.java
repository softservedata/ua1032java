package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    GroundVehicle(int passengers){
        super(passengers);
    }
    public void drive(){
    }
}
