package com.softserve.homework.homework5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_03 {

    @Test
    public void getPosOfSecondPositiveNumTest() {
        int[] numbers = {3, -1, 4, 2, 1};
        int expected = 3;
        int actual;

        actual = Homework05_01_03.getPosOfSecondPositiveNum(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinimumValueTest() {
        int[] numbers = {3, -1, 4, 2, 1};
        int expected = -1;
        int actual;

        actual = Homework05_01_03.getMinimumValue(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinimumValueI() {
        int[] numbers = {3, -1, 4, 2, 1};
        int expected = 1;
        int actual;

        actual = Homework05_01_03.getMinimumValueI(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getProductOfEvenNumbersTest() {
        int[] numbers = {3, -1, 4, 2, 1};
        int expected = 8;
        int actual;

        actual = Homework05_01_03.getProductOfEvenNumbers(numbers);

        Assertions.assertEquals(expected, actual);
    }
}
