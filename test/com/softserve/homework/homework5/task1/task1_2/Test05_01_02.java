package com.softserve.homework.homework5.task1.task1_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_02 {

    @Test
    public void calculatorSumTest() {
        Calculator calc;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 15; // the sum of first 5 elements
        int actual;

        calc = new Calculator(numbers);
        actual = calc.getResult();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatorProductTest() {
        Calculator calc = new Calculator();
        int[] numbers = {1, 2, -3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 30240; // the product of last 5 elements
        int actual;

        calc.setNumbers(numbers);
        actual = calc.getResult();

        Assertions.assertEquals(expected, actual);
    }
}
