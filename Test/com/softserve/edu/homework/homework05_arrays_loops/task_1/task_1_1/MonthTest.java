package com.softserve.edu.homework.homework05_arrays_loops.task_1.task_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MonthTest {
    @Test
    public void check_day_of_Month_1() {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int actual = Month.getNumberOfDaysInMonth(1, monthDays);

        int expected = 31;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_day_of_Month_2() {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int actual = Month.getNumberOfDaysInMonth(2, monthDays);

        int expected = 28;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void check_day_of_Month_in_a_leap_year() {

        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int actual = Month.getNumberOfDaysInMonth(2, monthDays);

        int expected = 29;
        Assertions.assertEquals(expected,actual);
    }
}
