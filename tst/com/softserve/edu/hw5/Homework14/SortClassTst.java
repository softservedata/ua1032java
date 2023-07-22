package com.softserve.edu.hw5.Homework14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortClassTst {
    @Test
    public void sortTst(){
        Car[] cars = new Car[4];
        SortClass sortClass = new SortClass();

        cars[0] = new Car("sport-car", 2020, 11);
        cars[1] = new Car("coupe", 2005, 2.0);
        cars[2] = new Car("sedan", 2010, 2.0);
        cars[3] = new Car("sedan", 2007, 1.5);

        Car[] cars1 = new Car[4];
        cars1[0] = new Car("coupe", 2005, 2.0);
        cars1[1] = new Car("sedan", 2007, 1.5);
        cars1[2] = new Car("sedan", 2010, 2.0);
        cars1[3] = new Car("sport-car", 2020, 11);

        Car[] cars2 = sortClass.sort(cars);
        boolean expected = true;
        boolean actual = true;
        for(int i = 0; i < cars2.length; i++){
            if(cars1[i].equals(cars2[i]) == false){
                actual = false;
            }
        }
        Assertions.assertEquals(expected, actual);



    }

}
