package com.softserve.edu.ArrayAndLoops.Homework14;

public class SortClass {
    public void sort(Car[] cars){
        int len = cars.length; //size of array cars
        Car car;
        for (int i = 0; i < len - 1; i++) { //bubble sort
            for (int j = 0; j < len - 1 - i; j++) {
                if(cars[j].getYear() > cars[j + 1].getYear()){
                    car = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = car;
                }
            }
        }
    }
}
