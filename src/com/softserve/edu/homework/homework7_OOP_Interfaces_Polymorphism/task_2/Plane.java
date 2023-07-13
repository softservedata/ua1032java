package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_2;

public class Plane extends FlyingVehicle {
    int maxDistance;
    Plane(int passengers, int maxDistance){
    super(passengers);
    this.maxDistance = maxDistance;
    }
    public int getMaxDistance(){
        return maxDistance;
    }
    public void setMaxDistance(int maxDistance){
        this.maxDistance = maxDistance;
    }
    @Override
    public void fly(){
        System.out.println("i can fly short distance");
    }
    @Override
    public void land(){
        System.out.println("i can't move by land");
    }
    @Override
    public String toString(){
        return "Plane { Passengers : "+ getPassengers()+ ";  Max distance : " + maxDistance + "m }";
    }
}
