package com.softserve.edu.homework.homework_07_OOP_Interfaces_Polymorphism.task_2;

public class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;
    Helicopter(int pasangers, int weight, int maxHeight){
        super(pasangers);
        this.weight = weight;
        this.maxHeight = maxHeight;
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
        return "Helicopter { Passengers : " + getPassengers() + ";  Weight : " + weight + "kg;  Max height : " + maxHeight + "m }";
    }

}
