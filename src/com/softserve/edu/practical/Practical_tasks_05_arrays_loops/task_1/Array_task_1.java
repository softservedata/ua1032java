package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;
import java.util.Arrays;
public class Array_task_1 {
    public static String sortedArray(String[] arrayString){
        Arrays.sort(arrayString);
        return Arrays.toString(arrayString);
    }

    public static void main(String[]args){
        String[] arrayString = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("Sorted array: " + sortedArray(arrayString));
    }
}
