package com.softserve.homework.homework5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_02 {

    @Test
    public void isSumPositiveTest() {
        int[] numbers = {3, 4, 1, -2, 4, 6, 5, 3 ,1, 2};

        Assertions.assertFalse(Homework05_01_02.isSumPositive(numbers));
    }

    @Test
    public void calcNumbersSum() {
        int[] numbers = {3, 4, 1, 2, 4, 6, 5, 3 ,1, 2};
        int expected = 14; // 3 + 4 + 1 + 2 + 4 = 14
        int actual;

        actual = Homework05_01_02.calcNumbersSum(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcNumbersProduct() {
        int[] numbers = {3, 4, 1, -2, 4, 6, 5, 3 ,1, 2};
        int expected = 180; // 6 * 5 * 3 * 1 * 2 = 180
        int actual;

        actual = Homework05_01_02.calcNumbersProduct(numbers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Task2Test() {
        int[] numbers = {3, 4, 1, -2, 4, 6, 5, 3 ,1, 2};
        int expectedSum = 0;
        int expectedProduct = 180; // 6 * 5 * 3 * 1 * 2 = 180
        int actualSum = 0;
        int actualProduct = 1;

        if(Homework05_01_02.isSumPositive(numbers)){
            actualSum = Homework05_01_02.calcNumbersSum(numbers);
        } else {
            actualProduct = Homework05_01_02.calcNumbersProduct(numbers);
        }

        Assertions.assertEquals(expectedSum, actualSum);
        Assertions.assertEquals(expectedProduct, actualProduct);
    }
}
