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
        boolean actual;
        boolean expected = true;
        int min = 7;
        int max = 8;
        int interval = max - min;
        int rand = (int) ((Math.random() * ++interval)) + min;
        int b = 7;
        if (b == rand){
            actual = true;
        }
        else {actual = false;}
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Guessed_or_no_Test2(){
        boolean actual;
        boolean expected = true;
        int min = -1;
        int max = 0;
        int interval = max - min;
        int rand = (int) ((Math.random() * ++interval)) + min;
        int b = -1;
        if (b == rand){
            actual = true;
        }
        else {actual = false;}
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void Guessed_or_no_Test3(){
        boolean actual ;
        boolean expected = true;
        int b = 29;
        if (b == Random_number.Random()){
            actual = true;
        }
        else {actual = false;}
        Assertions.assertNotEquals(expected, actual);
    }
}
