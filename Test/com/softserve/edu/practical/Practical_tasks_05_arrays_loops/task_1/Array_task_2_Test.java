package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array_task_2_Test {

    @Test
    void calculateAverageTest1() {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        double actual = Array_task_2.calculateAverage(intArray);
        double expected = 5;
        assertEquals(actual, expected);
    }
    @Test
    void calculateAverageTest2() {
        int[] intArray = {10,20,30,40,50};
        double actual = Array_task_2.calculateAverage(intArray);
        double expected = 30;
        assertEquals(actual, expected);
    }
    @Test
    void calculateAverageTest3() {
        int[] intArray = {12,20,41,54,33};
        double actual = Array_task_2.calculateAverage(intArray);
        double expected = 32 ;
        assertEquals(actual, expected);
    }
}
