package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;
    Motorcycle(int passengers, int maxSpeed){
        super(passengers);
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void drive(){
        System.out.println("i'm going on a motorcycle");
    }
    @Override
    public String toString(){
        return "Motorcycle { Passengers : "+getPassengers() + ";  Max Speed : "+ maxSpeed + "km/h }";
    }
}
