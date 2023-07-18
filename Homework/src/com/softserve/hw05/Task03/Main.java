package com.softserve.hw05.Task03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Car [] cars = new Car[4];
       cars[0] = new Car("Compartment", 2016, 1.6);
       cars[1] = new Car("Sedan", 2010, 2.0);
       cars[2] = new Car("Pickup", 2020, 2.5);
       cars[3] = new Car("Limousine", 2021, 1.8);

        // certain model year
        System.out.println("Enter the model year: ");
        int year = sc.nextInt();
        for(Car carYear : cars){
            if(carYear.getYearOfProduction() == year){
                System.out.println(carYear);
            }
        }

        // sorted cars by the field "year of production"
        Car temp;
        for(int i = 0; i < cars.length - 1; i++){
            for(int j = 0; j < cars.length - 1 - i; j++){
                if(cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()){
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));

    }
}
