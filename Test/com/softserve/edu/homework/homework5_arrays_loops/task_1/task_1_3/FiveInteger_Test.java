package com.softserve.edu.homework.homework5_arrays_loops.task_1.task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiveInteger_Test{
    @Test
    public void  check_SecondPositiveNumber1(){
        int [] arr ={1,1,-9,6,5};
        int actual = FiveInteger.SecondPositiveNumber(arr);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_SecondPositiveNumber2(){
        int [] arr ={1,-3,5,-4,5};
        int actual = FiveInteger.SecondPositiveNumber(arr);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_SecondPositiveNumber3(){
        int [] arr ={1,-3,-5,6,5};
        int actual = FiveInteger.SecondPositiveNumber(arr);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_MinimalValue1(){
        int [] arr ={0,-3,-5,9,-16};
        int actual = FiveInteger.MinimalValue(arr);
        int expected = -16;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_MinimalValue2(){
        int [] arr ={4,5,9,0,-1};
        int actual = FiveInteger.MinimalValue(arr);
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_MinimalValue3(){
        int [] arr ={-57,-99,67,94,-100};
        int actual = FiveInteger.MinimalValue(arr);
        int expected = -100;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_ProductEvenNumber1(){
        int [] arr ={2,7,2,8,9};
        int actual = FiveInteger.ProductEvenNumber(arr);
        int expected = 32;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_ProductEvenNumber2(){
        int [] arr ={3,1,2,9,7};
        int actual = FiveInteger.ProductEvenNumber(arr);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void check_ProductEvenNumber3(){
        int [] arr ={9,-7,-18,0,99};
        int actual = FiveInteger.ProductEvenNumber(arr);
        int expected = -18;
        Assertions.assertEquals(expected, actual);
    }

}