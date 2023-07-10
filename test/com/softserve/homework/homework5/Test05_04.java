package com.softserve.homework.homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class Test05_04 {

    @Test
    public void DoWhileLoopTest1() {
        Random rand = new Random();
        int expected = 8;
        int actual = 8;

        Assertions.assertTrue(Homework05_04.guessNumber(actual, expected));
    }

    @Test
    public void DoWhileLoopTest2() {
        Random rand = new Random();
        int expected = 8;
        int actual = 3;

        Assertions.assertFalse(Homework05_04.guessNumber(actual, expected));
    }
}
