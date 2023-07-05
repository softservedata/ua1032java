package com.softserve.homework.hw05.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Double.sum;

public class TwoNumbersSumTest {
@Test
    public void checkSum() {
    //double sum = num1 + num2;
    TwoNumbersSum sum = new TwoNumbersSum();
    double actual;
    double expected;

    expected = 4;
    actual = sum(2 , 2);

    Assertions.assertEquals( expected, actual, 0.001 );
}

    @Test
    public void checkSum2() {
        //double sum = num1 + num2;
        TwoNumbersSum sum = new TwoNumbersSum( );
        double actual;
        double expected;

        expected = 5.25;
        actual = sum( 1.25, 4 );

        Assertions.assertEquals( expected, actual, 0.001 );
    }
}
