package com.softserve.edu.homework.homework5_arrays_loops.task_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;

public class Random_number_Test {
    @Test
    public void RandomTest_OutOfRange1(){
        int actual = Random_number.Random();
        int expected = 16;
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    public void RandomTest_OutOfRange2(){
        int actual = Random_number.Random();
        int expected = -11;
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    public void RandomTest_OutOfRange3(){
        int actual = Random_number.Random();
        int expected = 21;
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    public void Guessed_or_no_Test1(){
        boolean actual = true;
        boolean expected;
        int b = 16;
        if (b == Random_number.Random()){
            expected = true;
        }
        else {expected = false;}
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    public void Guessed_or_no_Test2(){
        boolean actual = true;
        boolean expected;
        int b = -11;
        if (b == Random_number.Random()){
            expected = true;
        }
        else {expected = false;}
        Assertions.assertNotEquals(expected, actual);
    }
    @Test
    public void Guessed_or_no_Test3(){
        boolean actual = true;
        boolean expected;
        int b = 29;
        if (b == Random_number.Random()){
            expected = true;
        }
        else {expected = false;}
        Assertions.assertNotEquals(expected, actual);
    }
}
