package com.softserve.HomeWork.HW5.task1.task1_2.HW5_task1_2;
import com.softserve.HomeWork.HW5.task1.task1_2.HW5_task1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class HW_task1_2 {
    @Test
    public void testIsPositive1(){
        int[] arr = {-1,2,3,4};
        Assertions.assertFalse(HW5_task1_2.isPositive(arr));
    }
    @Test
    public void testIsPositive2(){
        int[] arr = {-1,-2,-3,-4};
        Assertions.assertFalse(HW5_task1_2.isPositive(arr));
    }
    @Test
    public void testIsPositive3(){
        int[] arr = {1,2,3,4};
        Assertions.assertTrue(HW5_task1_2.isPositive(arr));
    }
    @Test
    public void testAddition() {
        int[] array = {1,2,3,4,5,6,8,7,9,10};
        int expected= 15;
        int actual = HW5_task1_2.func(array);

        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void testMultiplication(){
        int[] array = {10,9,-7,6,5,4,3,2,2};
        int expected= 240;
        int actual = HW5_task1_2.func(array);

        Assertions.assertEquals(expected , actual);
    }

}
