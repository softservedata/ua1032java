package com.softserve.Homework.hw_5.task1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class OperationsTest {
    @Test
    public void testFindSecondPositiveIndex(){
        int[] numbers = {1, -2, 3, -4, 5};
        int excepted = 3;
        int actual = OperationsWithArray.findSecondPositiveIndex(numbers);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testFindMinValue() {
        int[] numbers = {1, -2, 3, -4, 5};
        int excepted = -4;
        int actual = OperationsWithArray.findMinValue(numbers);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void testFindIndexOfMinValue() {
        int[] numbers = {1, -2, 3, -4, 5};
        int excepted = 4;
        int actual = OperationsWithArray.findMinIndex(numbers);
        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void testFindProductOfEvens() {
        int[] numbers = {1, -2, 3, -4, 5};
        int excepted = 8;
        int actual = OperationsWithArray.findProductOfEvens(numbers);
        Assertions.assertEquals(excepted, actual);

    }
}
