package com.softserve.homework.homework5.task1.task1_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_03 {

    @Test
    public void getPosOfSecondPositiveNumTest() {
        Calculator calc = new Calculator();
        int[] numbers = {3, -1, 4, 2, 1};
        calc.setNumbers(numbers);
        int expected = 3;
        int actual;

        actual = calc.getPosOfSecondPositiveNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinimumValueTest() {
        Calculator calc = new Calculator();
        int[] numbers = {3, -1, 4, 2, 1};
        calc.setNumbers(numbers);
        int expected = -1;
        int actual;

        actual = calc.getMinimumValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinimumValueI() {
        Calculator calc = new Calculator();
        int[] numbers = {3, -1, 4, 2, 1};
        calc.setNumbers(numbers);
        int expected = 1;
        int actual;

        actual = calc.getMinimumValueI();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getProductOfEvenNumbersTest() {
        Calculator calc = new Calculator();
        int[] numbers = {3, -1, 4, 2, 1};
        calc.setNumbers(numbers);
        int expected = 8;
        int actual;

        actual = calc.getProductOfEvenNumbers();

        Assertions.assertEquals(expected, actual);
    }
}
