package com.softserve.HomeWork.HW5.task1.task1_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task1_2 {
    @Test
    public void testTask2Positive(){
        int actual = 6;
        int array[] = {1,2,3,4,5,6};
        int expected = HW5_task1_2.func(array);
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void testTask2Negative(){
        int actual = -120;
        int array[] = {-1,2,3,-4,5,6};
        int expected = HW5_task1_2.func(array);
        Assertions.assertEquals(actual,expected);
    }
}
