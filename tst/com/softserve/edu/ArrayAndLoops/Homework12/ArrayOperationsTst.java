package com.softserve.edu.ArrayAndLoops.Homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTst {
    @Test
    public void findPositiveNumTst(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int actual, expected;

        int[] arr = new int[]{0, 1, -4, -5, 5};

        System.out.println("First part: ");
        //first part
        arrayOperations.setElements(arr);

        expected = arr[4]; // expected results

        actual = arrayOperations.findPositiveNum(); // actual results

        Assertions.assertEquals(expected, actual);

        System.out.println("Second part: ");
        //second part

        arr = new int[]{0, -1, 1, -4, -9};

        arrayOperations.setElements(arr);

        expected = 1000; // expected results

        actual = arrayOperations.findPositiveNum(); // actual results

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinNumTst(){
        ArrayOperations arrayOperations = new ArrayOperations();

        int actual, expected;

        int[] arr = new int[]{0, 1, -4, -5, 5};

        expected = arr[3];

        arrayOperations.setElements(arr);

        actual = arrayOperations.findMinNum();

        System.out.println(actual);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calculateEvenNumTst(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int actual, expected;

        int[] arr = new int[]{0, 1, -3, -5, 5};

        arrayOperations.setElements(arr);

        expected = 0;
        actual = arrayOperations.calculateEvenNum();

        Assertions.assertEquals(expected, actual);

    }

}
