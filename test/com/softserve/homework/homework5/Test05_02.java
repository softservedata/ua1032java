package com.softserve.homework.homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_02 {

    @Test
    public void DoWhileLoopTest1() {
        String input = "+";

        Assertions.assertTrue(Homework05_02.checkInput(input));
    }

    @Test
    public void DoWhileLoopTest2() {
        String input = "-";

        Assertions.assertFalse(Homework05_02.checkInput(input));
    }

    @Test
    public void DoWhileLoopTest3() {
        String input = "something else";

        Assertions.assertFalse(Homework05_02.checkInput(input));
    }
}
