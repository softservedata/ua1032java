package com.softserve.edu.homework.homework5_arrays_loops.task_1.task_1_2;

import java.io.IOException;
public class Appl {
    public static void main(String [] args) throws IOException {
        int[] number = Sum_or_Product.InputArr();
        Sum_or_Product.Print(number);
        int result = Sum_or_Product.Sum_or_Prod(number);
        System.out.println("\nResult  :  " + result);
    }
}

