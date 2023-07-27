package com.softserve.HomeWork.HW5.task1.task1_3;

import com.softserve.HomeWork.HW5.task1.task1_2.HW5_task1_2;

import java.io.IOException;
import java.util.Arrays;

public class HW5_task1_3 {
    public static Integer SecondPositiveElement(final int[] array) {

        int positiveNumber = 0;
        //------------------------------------------------
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveNumber++;
            }
            if (positiveNumber == 2) {
                return array[i];
            }
        }
        return null;
    }
    public static int minIndex(int... array){
        int index = 0;
        int min = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int productEvenNumber(final int[] array){
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                product *= array[i];
            }
        }
        return product;
    }
    public static void main(String[] args) throws IOException {

        int[] array = HW5_task1_2.inputArray();

        int positiveElement = SecondPositiveElement(array);

        System.out.println("Second positive element: " + positiveElement);
        //------------------------------------------------

        int index = minIndex(array);

        System.out.println("Minimal element: " + array[index]);
        System.out.println("Index: " + index);

        //------------------------------------------------

        int product = productEvenNumber(array);

        System.out.println("The product of all entered even numbers: "+ product);

        System.out.println(Arrays.toString(array));
    }
}
