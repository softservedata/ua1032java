package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array_task_1_Test {
    @Test
    void ArrayIsSortedTest1() {
        String[] arrayString = {"banana", "apple", "orange", "grape", "kiwi"};
        String actual = Array_task_1.sortedArray(arrayString);
        String expected = "[apple, banana, grape, kiwi, orange]";
        assertEquals(actual, expected);
    }

    @Test
    void ArrayIsSortedTest2(){
        String[] arrayString = {"elephant", "pineapple", "rainbow", "computer", "sunlight"};
        String actual = Array_task_1.sortedArray(arrayString);
        String expected = "[computer, elephant, pineapple, rainbow, sunlight]";
        assertEquals(actual, expected);
    }
    @Test
    void ArrayIsSortedTest3(){
        String[] arrayString = {"mountain", "butterfly", "waterfall", "adventure", "firefly"};
        String actual = Array_task_1.sortedArray(arrayString);
        String expected = "[adventure, butterfly, firefly, mountain, waterfall]";
        assertEquals(actual, expected);
    }
}

