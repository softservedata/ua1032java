package com.softserve.edu.homework.homework6_OOP_Encapsulation_Inheritance.task_1;

public abstract class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("I can fly ");
    }
    public abstract void flight_speed();
}
