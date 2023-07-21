package com.softserve.edu.homework.homework_05_arrays_loops.task_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.*;
public class Do_While_Test {
    @Test
    public void testDoWhileSum1() throws IOException {
        double x = 5;
        double y = 9;

        double actual = Do_While.Add(x,y);
        double expected = 14;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDoWhileSum2() throws IOException {
        double x = -3.456;
        double y = 4.589;

        double actual = (float)Do_While.Add(x,y);
        double expected = 1.133f;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDoWhileSum3() throws IOException {
        double x = -13;
        double y = 22;

        double actual = Do_While.Add(x,y);
        double expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDoWhileAgree_to_continue1() throws IOException {
        String answer = "Yes";
        InputStream in = new ByteArrayInputStream(answer.getBytes()); //converts a string to a byte array
        System.setIn(in);//будь-яке наступне читання з System.in буде читати дані з ByteArrayInputStream, який містить байтовий масив, що відповідає рядку "Yes"
        boolean actual = Do_While.Agree_to_continue();
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDoWhileAgree_to_continue2() throws IOException {
        String answer = "No";
        InputStream in = new ByteArrayInputStream(answer.getBytes()); //converts a string to a byte array
        System.setIn(in);//будь-яке наступне читання з System.in буде читати дані з ByteArrayInputStream, який містить байтовий масив, що відповідає рядку "Yes"
        boolean actual = Do_While.Agree_to_continue();
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDoWhileAgree_to_continue3() throws IOException {
        String answer = "Maybe";
        InputStream in = new ByteArrayInputStream(answer.getBytes()); //converts a string to a byte array
        System.setIn(in);//будь-яке наступне читання з System.in буде читати дані з ByteArrayInputStream, який містить байтовий масив, що відповідає рядку "Yes"
        boolean actual = Do_While.Agree_to_continue();
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}
