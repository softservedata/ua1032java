package com.softserve.edu.hw5.Homewok14;

public class ApplCar {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("sport-car", 2020, 11);
        cars[1] = new Car("coupe", 2005, 2.0);
        cars[2] = new Car("sedan", 2010, 2.0);
        cars[3] = new Car("sedan", 2007, 1.5);

       SortClass sortClass = new SortClass();

       Car[] cars1 = sortClass.sort(cars);

       for (Car car : cars1){
           System.out.println(car);
       }
    }
}
