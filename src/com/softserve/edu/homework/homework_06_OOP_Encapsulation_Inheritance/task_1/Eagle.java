package com.softserve.edu.homework.homework_06_OOP_Encapsulation_Inheritance.task_1;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void flight_speed (){
        System.out.println("I fly at a speed of 190-240 km/h");
    }
    public void fly() {
        super.fly();
    }
}
