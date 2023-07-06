package com.softserve.homework.hw06.task1;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Swallow can fly");
    }
}
