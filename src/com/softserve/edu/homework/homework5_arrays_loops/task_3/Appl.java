package com.softserve.edu.homework.homework5_arrays_loops.task_3;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
public class Appl {
    public static void main(String[]args)throws IOException {
        Scanner input = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0]= new Car("Sedan",1987, 1.8 );
        cars [1] = new Car("Coupe",1980, 3.7 );
        cars [2] = new Car("SUV",2018, 4.4 );
        cars [3] = new Car("Supercar",2020, 7.9);

        System.out.print("Enter the year of the car you want to get : ");
        int year = Integer.parseInt(input.nextLine());
        for (Car car : cars) {
            if (Objects.equals(car.getYear_of_production(), year)) {
                System.out.println("\nWe can offer you this car : ");
                System.out.println(car);
                break;
            }
        }

        Car change;
        for (int i = 0; i < cars.length;i++){
            for(int j = 0; j < cars.length;j++){
                if(cars[i].getYear_of_production()<cars[j].getYear_of_production()){
                   change = cars[i];
                   cars[i] = cars[j];
                   cars[j] = change;
                }
            }
        }
        System.out.println("\nСars are sorted by year :\n");

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}


