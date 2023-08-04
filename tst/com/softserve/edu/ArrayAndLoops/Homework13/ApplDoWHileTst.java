package com.softserve.edu.ArrayAndLoops.Homework13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplDoWHileTst {
    @Test
    public void SumTst (){
        ApplDoWhile applDoWhile = new ApplDoWhile();
        int expected = 9;
        int actual = applDoWhile.Sum(4, 5);

        Assertions.assertEquals(expected, actual);
    }
}
