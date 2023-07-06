package com.softserve.Homework.hw_5.task2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class SumCalcTest {
    @Test
    public void SumCalcTest1(){
        int excepted = 5;
        int actual = SumCalc.calculateSum(2,3);
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void SumCalcTest2(){
        int excepted = 9;
        int actual = SumCalc.calculateSum(6,3);
        Assertions.assertEquals(excepted, actual);
    }
}
