package com.softserve.HomeWork.HW5.task1.task1_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task1_1 {
    @Test
    public void testMonthByNumEnum(){
        Month actual =  Month.December;
        Month expected =Month.getByMonthNumber(12);
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testMonthByNumArray(){
        int actual = 31;
        int expected = HW5_task1_1.months[11]; //October

        Assertions.assertEquals(actual,expected);
    }
}
