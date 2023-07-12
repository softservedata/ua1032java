package com.softserve.lesson05tst.hw05tst.task01tst;

import com.softserve.lesson05.hw05.task01.MonthApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthAppTest {

    @Test
    public void checkMonthDays01() {
        double actual;
        double expected;
        //
        expected = 28.0;
        actual = MonthApp.getMonthDays(2);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkMonthDays02() {
        double actual;
        double expected;
        //
        expected = 30.0;
        actual = MonthApp.getMonthDays(6);
        //
        Assertions.assertEquals(expected, actual, 0.001);
    }

}
