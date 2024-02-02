package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    @Test
    void primeNumberTest1(){
        int number = 1;
        boolean actual = PrimeNumber.primeNumber(number);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    @Test
    void primeNumberTest2(){
        int number = 12;
        boolean actual = PrimeNumber.primeNumber(number);
        boolean expected = false;
        assertEquals(actual, expected);
    }
    @Test
    void primeNumberTest3(){
        int number = 17;
        boolean actual = PrimeNumber.primeNumber(number);
        boolean expected = true;
        assertEquals(actual, expected);
    }
}