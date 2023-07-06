package com.softserve.homework.hw06.task1;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Eagle can fly");
    }
}
