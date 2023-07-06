package com.softserve.Homework.hw_5.task1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class SumOfElementsTest {
    @Test
    public void testAreFirstFivePositive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        boolean actual = SumOfElements.areFirstFivePositive(numbers);
        Assertions.assertEquals(true, actual);

        numbers = new int[]{1, -2, 3, 4, -5, 12, 21, 43, 14, 25};
        actual = SumOfElements.areFirstFivePositive(numbers);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void testSumOfFirstFive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        int actual = SumOfElements.sumOfFirstFive(numbers);
        Assertions.assertEquals(15, actual);
    }

    @Test
    public void testProductOfLastFive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        int actual = SumOfElements.productOfLastFive(numbers);
        Assertions.assertEquals(-120, actual);
    }
}

