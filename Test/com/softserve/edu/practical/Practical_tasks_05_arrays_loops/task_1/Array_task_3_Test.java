package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array_task_3_Test {

    @Test
    void containsValueTest1() {
        int[] arrayNum = {1,2,3,4,5,6,7,8};
        int number = 9;
        boolean actual = Array_task_3.containsValue(arrayNum,number);
        boolean expected = false;
        assertEquals(actual, expected);
    }
    @Test
    void containsValueTest2() {
        int[] arrayNum = {3,2,15,342,12,4,6,854};
        int number = 12;
        boolean actual = Array_task_3.containsValue(arrayNum,number);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    @Test
    void containsValueTest3() {
        int[] arrayNum = {41,34,25,76,45,23,12,55};
        int number = 76;
        boolean actual = Array_task_3.containsValue(arrayNum,number);
        boolean expected = true;
        assertEquals(actual, expected);
    }

}