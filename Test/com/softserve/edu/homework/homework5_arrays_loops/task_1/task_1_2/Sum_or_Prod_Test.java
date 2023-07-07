package com.softserve.edu.homework.homework5_arrays_loops.task_1.task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sum_or_Prod_Test{

    @Test
    public void check_Positive_or_Negative1(){
        int [] number ={1,1,4,6,5,5,6,9,8,9};
         boolean actual = Sum_or_Product.NumberPositive(number);
         boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_Positive_or_Negative2(){
        int [] number ={-2,0,15,9,5,5,6,7,8,9};
        boolean actual = Sum_or_Product.NumberPositive(number);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_Positive_or_Negative3(){
        int [] number ={-2,-6,1,6,3,10,196,11,34,9};
        boolean actual = Sum_or_Product.NumberPositive(number);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_correct_sum_or_product1(){
        int [] number ={1,2,3,4,5,5,6,7,8,9};
        int actual = Sum_or_Product.Sum_or_Prod(number);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_correct_sum_or_product2(){
        int [] number ={-12,9,0,-14,3,6,4,1,0,2};
        int actual = Sum_or_Product.Sum_or_Prod(number);
        int expected = 48;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_correct_sum_or_product3(){
        int [] number ={13,9,-7,3,1,0,0,0,0,0};
        int actual = Sum_or_Product.Sum_or_Prod(number);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}