package com.softserve.practical.practicalHW_6.task2Car;

public class Sedan extends Car{
    @Override
    public void run() {
        System.out.println("Run sedan");
    }

    @Override
    public void stop() {
        System.out.println("Stop sedan");
    }
}
