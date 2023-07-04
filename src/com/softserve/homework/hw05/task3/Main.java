package com.softserve.homework.hw05.task3;
/*
Create class called Car with fields: type, year of production and engine capacity.
Create and initialize  in main() method four instances of class Car.
Output result for cars:
certain model year  (enter year in the console);
sorted cars by the field “year of production ”.
 */

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        Car[] cars = new Car[4];
        cars[0] = new Car("Sport Car", 2020, 3.0  );
        cars[1] = new Car("Van", 2022, 2.0  );
        cars[2] = new Car("Sedan", 2022, 1.6  );
        cars[3] = new Car("Hybrid", 2023, 1.0  );

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println( "Input type of car: " );
//            String type = scanner.nextLine( );
//            System.out.println( "Input year of production for car: " );
//            int productionYear = scanner.nextInt( );
//            scanner.nextLine( );
//            System.out.println( "Input engine capacity for car: " );
//            double engineVolume = scanner.nextDouble( );
//            scanner.nextLine( );
//            Car car = new Car( type, productionYear, engineVolume );
//            cars[i] = car;
//        }

        System.out.println( "Enter year to filter cars: " );
        int filterYear = sc.nextInt( );
        System.out.println( "Sorted cars by year of production:" );
        for (int i = 0; i < cars.length; i++) {
            if ( cars[i].getProductionYear( ) == filterYear ) {
                System.out.println( cars[i] );
            }
        }
    }
}