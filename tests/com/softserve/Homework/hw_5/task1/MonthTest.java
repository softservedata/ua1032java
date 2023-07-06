package com.softserve.Homework.hw_5.task1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MonthTest {
    @Test
    public void Month1(){
       int month = 1;
       int expected = 31;
       int actual = Month.getDaysInMonth(month);
       Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Month2(){
        int month = 2;
        int expected = 28;
        int actual = Month.getDaysInMonth(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Month3(){
        int month = 3;
        int expected = 31;
        int actual = Month.getDaysInMonth(month);
        Assertions.assertEquals(expected, actual);
    }
    @Test
   public void InvalidNumberMonth(){
        int month = 13;
        int expected = 0;
        int actual = Month.getDaysInMonth(month);
        Assertions.assertEquals(expected, actual);
    }
}

