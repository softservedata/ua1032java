package com.softserve.homework.hw05.task1;

import org.junit.jupiter.api.Test;

public class TestNumbers {

    @Test
    public void NumbersTest01(){
        int actual;
        int expected;

        int[] array = {1, -2, -3, 1, 1, 1, 1, 1, 1, 1};
        actual= Numbers10.calculate(array);
        expected = 6;
    }

    @Test
    public void NumbersTest02(){
        int actual;
        int expected;

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        actual= Numbers10.calculate(array);
        expected = 5;
    }

    @Test
    public void NumbersTest03(){
        int actual;
        int expected;

        int[] array = {1, 2, 3, 4, 5, 1, 1, 1, 1, 1};
        actual= Numbers10.calculate(array);
        expected = 15;
    }

    @Test
    public void NumbersTest11(){
        int actual;
        int expected;

        int[] array = {-2, -3, -2, 1, 1};
        actual= NumbersArray5.findPositionOfSecondPositive(array);
        expected = 4;
    }

    @Test
    public void NumbersTest12(){
        int actual;
        int expected;

        int[] array = {-2, -3, -2, 1, 1};
        actual= NumbersArray5.calcProductOfEven(array);
        expected = 4;
    }

    @Test
    public void NumbersTest13(){
        int[] actual;
        int[] expected;

        int[] array = {-2, -3, -2, 1, 1};
        actual= NumbersArray5.findPositionAndValueOfMin(array);
        expected = new int[]{-3, 1};
    }
}
