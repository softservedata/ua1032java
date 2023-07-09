package com.softserve.edu05tst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void checkAdd01() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 4.0001;
        actual = calc.add(2, 2);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkAdd02() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = calc.add(1, 3);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkDiv01() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = calc.div(20, 5);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkDiv02() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }
}
