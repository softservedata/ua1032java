package com.softserve.edu.homework.homework5_arrays_loops.task_1.task_1_3;

import java.io.IOException;

public class Appl {
    public static void main(String[]args)throws IOException {

    int[] arr = FiveInteger.InputArr();
    FiveInteger.Print(arr);
    int pos_num = FiveInteger.SecondPositiveNumber(arr);
    System.out.println("\nSecond Positive Number  :  " + pos_num);
    int min_val = FiveInteger.MinimalValue(arr);
    System.out.println("\nMinimal Value :  " + min_val);
    int prod_num = FiveInteger.ProductEvenNumber(arr);
    System.out.println("\nProduct even number  :  "+ prod_num );
}}

