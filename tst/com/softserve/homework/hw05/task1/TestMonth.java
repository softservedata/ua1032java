package com.softserve.homework.hw05.task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMonth {

    @Test
    public void MonthTest01(){
        Month month = new Month();
        int actual;
        int expected;
        // December
        expected = 31;
        actual = month.calculateDaysInMonth(12);
        // check
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthTest02(){
        Month month = new Month();
        int actual;
        int expected;
        // February
        expected = 28;
        actual = month.calculateDaysInMonth(2);
        // check
        Assertions.assertEquals(expected, actual);
    }
}
