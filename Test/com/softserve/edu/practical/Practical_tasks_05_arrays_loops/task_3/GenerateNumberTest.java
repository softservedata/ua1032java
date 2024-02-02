package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateNumberTest {
    @Test
    void biggest_number_test1() {
        int[] randomNumber = {-99,76,-33,55,62,89,-53,0,22,99};
        int actual = GenerateNumber.biggest_number(randomNumber);
        int expected = 99;
        assertEquals(actual, expected);
    }
    @Test
    void biggest_number_test2() {
        int[] randomNumber = {-99,76,-33,55,62,89,-53,0,22,1};
        int actual = GenerateNumber.biggest_number(randomNumber);
        int expected = 89;
        assertEquals(actual, expected);
    }
    @Test
    void sum_positive_test1() {
        int[] randomNumber = {-99,76,-33,55,62,89,-53,0,22,1};
        int actual = GenerateNumber.sum_positive_numbers(randomNumber);
        int expected = 305;
        assertEquals(actual, expected);
    }
    @Test
    void sum_positive_test2() {
        int[] randomNumber = {-32,0,-33,5,92,59,-3,0,12,6};
        int actual = GenerateNumber.sum_positive_numbers(randomNumber);
        int expected = 174;
        assertEquals(actual, expected);
    }
    @Test
    void count_negative_test1() {
        int[] randomNumber = {-32,0,-33,5,92,59,-3,0,12,6};
        int actual = GenerateNumber.count_negative_numbers(randomNumber);
        int expected = 3;
        assertEquals(actual, expected);
    }
    @Test
    void count_negative_test2() {
        int[] randomNumber = {-32,41,33,5,62,9,-30,50,62,1};
        int actual = GenerateNumber.count_negative_numbers(randomNumber);
        int expected = 2;
        assertEquals(actual, expected);
    }
    @Test
    void comparison_test1() {
        int[] randomNumber = {-32,41,33,5,62,9,-30,50,62,1};
        int actual = GenerateNumber.comparison(randomNumber);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @Test
    void comparison_test2() {
        int[] randomNumber = {-32,-41,33,-5,62,9,-30,50,62,-1};
        int actual = GenerateNumber.comparison(randomNumber);
        int expected = 0;
        assertEquals(actual, expected);
    }

}