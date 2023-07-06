package com.softserve.homework.hw06.task1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        System.out.println("Penguin can't fly");
    }
}
