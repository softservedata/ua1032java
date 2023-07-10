package com.softserve.homework.homework5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_01 {

    @Test
    public void Task1Test() {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int expected = monthDays[3 - 1];
        int actual;

        actual = Homework05_01_01.getMonthDays(3);

        Assertions.assertEquals(expected, actual);
    }
}
