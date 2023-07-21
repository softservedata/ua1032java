package com.softserve.edu.homework.homework_05_arrays_loops.task_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Car_Test {

    @Test
    public void TestCar1(){
        Car[] cars = new Car[1];
        cars[0] = new Car("Truck", 2010, 12.8);
        int year = 2010;
        int expected = 2010;
        int actual = 0;

        for(int i = 0; i < 2023; i++){
            if(year == i){
                for(int j = 0;j < cars.length; j++){
                    if(year == cars[0].getYear_of_production()){
                        actual = cars[0].getYear_of_production();
                        break;
                    }
                    else {actual = 0;}
                }
            }
        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestCar2(){
        Car[] cars = new Car[1];
        cars[0] = new Car("Pickup", 2018, 2.4);
        int year = 2018;
        int expected = 2018;
        int actual = 0;

        for(int i = 0; i < 2023; i++){
            if(year == i){
                for(int j = 0;j < cars.length; j++){
                    if(year == cars[0].getYear_of_production()){
                        actual = cars[0].getYear_of_production();
                        break;
                    }
                    else {actual = 0;}
                }
            }
        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestCar3(){
        Car[] cars = new Car[1];
        cars[0] = new Car("Minivan", 2020, 4.1);
        int year = 2020;
        int expected = 2020;
        int actual = 0;

        for(int i = 0; i < 2023; i++){
            if(year == i){
                for(int j = 0;j < cars.length; j++){
                    if(year == cars[0].getYear_of_production()){
                        actual = cars[0].getYear_of_production();
                        break;
                    }
                    else {actual = 0;}
                }
            }
        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SortedCarTest1(){
        Car[] cars = new Car[4];
        cars[0]= new Car("Sedan",1987, 1.8 );
        cars [1] = new Car("Coupe",1980, 3.7 );
        cars [2] = new Car("SUV",2018, 4.4 );
        cars [3] = new Car("Supercar",2020, 7.9);
        boolean actual = false;
        boolean expected = true;
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
        if(cars[0].getYear_of_production() <= cars[1].getYear_of_production() &&
                cars[1].getYear_of_production() <= cars[2].getYear_of_production() &&
                cars[2].getYear_of_production() <= cars[3].getYear_of_production()){
            actual = true;
        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SortedCarTest2(){
        Car[] cars = new Car[4];
        cars[0]= new Car("Universal",2013, 2.8 );
        cars [1] = new Car("Hatchback",2001, 2.7 );
        cars [2] = new Car("Hot Rod",1930, 4.1 );
        cars [3] = new Car("Van",1987, 4.8);

        boolean actual = false;
        boolean expected = true;
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
        if(cars[0].getYear_of_production() <= cars[1].getYear_of_production() &&
                cars[1].getYear_of_production() <= cars[2].getYear_of_production() &&
                cars[2].getYear_of_production() <= cars[3].getYear_of_production()){
            actual = true;
        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SortedCarTest3(){
        Car[] cars = new Car[4];
        cars[0]= new Car("Dragster",2002, 1.7 );
        cars [1] = new Car("Truck",2010, 11.9 );
        cars [2] = new Car("Muscle cars",1960, 5 );
        cars [3] = new Car("Sedan",1999, 2.1);

        boolean actual = false;
        boolean expected = true;
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
        if(cars[0].getYear_of_production() <= cars[1].getYear_of_production() &&
                cars[1].getYear_of_production() <= cars[2].getYear_of_production() &&
                cars[2].getYear_of_production() <= cars[3].getYear_of_production()){
            actual = true;
        }
        Assertions.assertEquals(expected, actual);
    }
}
