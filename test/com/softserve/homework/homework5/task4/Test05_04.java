package com.softserve.homework.homework5.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_04 {

    @Test
    public void DoWhileLoopTest1() {
        NumberGuesser ng = new NumberGuesser(3); // expected = 3
        int actual = 3;

        Assertions.assertTrue(ng.checkNumber(actual));
    }

    @Test
    public void DoWhileLoopTest2() {
        NumberGuesser ng = new NumberGuesser(8); // expected = 8
        int actual = 3;

        Assertions.assertFalse(ng.checkNumber(actual));
    }
}
