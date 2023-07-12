package com.softserve.lesson05tst.hw05tst.task01tst;

import com.softserve.lesson05.hw05.task01.OperationOfTenApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationOfTenAppTest {

    @Test
    public void checkIsItFivePositive01() {
        int arr[] = {5, 14, 22, 11, 52, -5, -7, 34, 11, 10};
        double actual;
        double expected;
        //
        expected = 104.0;
        actual = OperationOfTenApp.isItFivePositive(arr);
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkIsItFivePositive02() {
        int arr[] = {5, -14, 22, -11, 52, -5, -7, 34, 11, 10};
        double actual;
        double expected;
        //
        expected = 130900.0;
        actual = OperationOfTenApp.isItFivePositive(arr);
        Assertions.assertEquals(expected, actual, 0.001);
    }
}
