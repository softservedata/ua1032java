package com.softserve.homework.hw06.task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Kiwi can't fly");
    }
}
