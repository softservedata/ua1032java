package com.softserve.edu.homework.homework06_OOP_Encapsulation_Inheritance.task_1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    public void swimming_speed(){
        System.out.println("I swim at a speed of 6.6 km/h");
    }
    public void fly() {
        super.fly();
    }
}
