package com.softserve.practical.practicalHW_6.task2Car;

public class Truck extends Car{
    @Override
    public void run() {
        System.out.println("Run truck");
    }

    @Override
    public void stop() {
        System.out.println("Stop truck");
    }
}
