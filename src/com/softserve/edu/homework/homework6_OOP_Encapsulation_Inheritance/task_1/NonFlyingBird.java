package com.softserve.edu.homework.homework6_OOP_Encapsulation_Inheritance.task_1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
