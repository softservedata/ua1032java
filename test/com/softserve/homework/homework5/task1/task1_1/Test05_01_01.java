package com.softserve.homework.homework5.task1.task1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_01_01 {

    @Test
    public void daysInMonthTest() {
        Calendar calendar = new Calendar();
        int expected = 28;
        int actual;

        actual = calendar.getMonthDays(2);

        Assertions.assertEquals(expected, actual);
    }
}
