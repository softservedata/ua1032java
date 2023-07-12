package com.softserve.lesson05tst.hw05tst.task01tst;

import com.softserve.lesson05.hw05.task01.OperationOfFiveApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationOfFiveAppTest {

    @Test
    public void checkArraySecondPositive01() {
        int arr[] = {5, -4, -7, 12, -2};
        double actual;
        double expected;
        //
        expected = 3.0;
        actual = OperationOfFiveApp.arraySecondPositiveIndex(arr);
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkArraySecondPositive02() {
        int arr[] = {5, 4, -7, -12, -2};
        double actual;
        double expected;
        //
        expected = 1.0;
        actual = OperationOfFiveApp.arraySecondPositiveIndex(arr);
        Assertions.assertEquals(expected, actual, 0.001);
    }
}
