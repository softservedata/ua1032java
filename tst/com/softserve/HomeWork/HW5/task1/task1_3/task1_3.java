package com.softserve.HomeWork.HW5.task1.task1_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task1_3 {
    @Test
    public void testSecondPositiveElement(){
        int actual = 5;
        int array[] = {-1,2,-3,-4,5,6};
        int expected = HW5_task1_3.SecondPositiveElement(array);
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testMinIndex(){
        int actual = 3;
        int array[] = {-1,2,-3,-4,5,6};
        int expected = HW5_task1_3.minIndex(array);
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testProductEvenNumber(){
        int actual = 48;
        int array[] = {-1,-2,3,-4,5,6};
        int expected = HW5_task1_3.productEvenNumber(array);
        Assertions.assertEquals(actual,expected);
    }
}
