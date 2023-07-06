package com.softserve.homework.hw05.task2;

import com.softserve.homework.hw05.task1.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumbers {
    @Test
    public void NumbersTest01(){
        double num2 = 2;
        double num1 = 3;
        IntNums nums = new IntNums(num1, num2);
        int actual;
        int expected;
        expected = 6;
        actual = IntNums.calculateProduct(nums);
        // check
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NumbersTest02(){
        double num2 = 2;
        double num1 = 2;
        IntNums nums = new IntNums(num1, num2);
        int actual;
        int expected;
        expected = 4;
        actual = IntNums.calculateProduct(nums);
        // check
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NumbersTest03(){
        double num2 = 0;
        double num1 = 2;
        IntNums nums = new IntNums(num1, num2);
        int actual;
        int expected;
        expected = 0;
        actual = IntNums.calculateProduct(nums);
        // check
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NumbersTest04(){
        double num2 = 2;
        double num1 = -2;
        IntNums nums = new IntNums(num1, num2);
        int actual;
        int expected;
        expected = -4;
        actual = IntNums.calculateProduct(nums);
        // check
        Assertions.assertEquals(expected, actual);
    }
}
