package com.softserve.homework.hw07.task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){
    }
    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }
    @Override
    public void land() {
        System.out.println("Helicopter can land");
    }
}