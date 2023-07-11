package com.softserve.homework.homework5.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_02 {

    @Test
    public void DoWhileLoopTest1() {
        Calculator calc = new Calculator();
        String input = "+";

        Assertions.assertTrue(calc.checkInput(input));
    }

    @Test
    public void DoWhileLoopTest2() {
        Calculator calc = new Calculator();
        String input = "-";

        Assertions.assertFalse(calc.checkInput(input));
    }

    @Test
    public void DoWhileLoopTest3() {
        Calculator calc = new Calculator();
        String input = "something else";

        Assertions.assertFalse(calc.checkInput(input));
    }

    @Test
    public void calcSumTest() {
        Calculator calc = new Calculator(3, 4);
        int expected = 7;
        int actual = calc.calcSum();

        Assertions.assertEquals(expected, actual);
    }
}
