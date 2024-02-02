package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;
import java.util.Scanner;

public class Array_task_3 extends Array_task_2{
    public static void main(String[] args){
        int[] arrayFromOtherFile = Array_task_2.intArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the arrays: ");
        int searchValue = scanner.nextInt();
        boolean containsValue = containsValue(arrayFromOtherFile, searchValue);
        System.out.println("Integer Array contains the value " + searchValue + ": " + containsValue);
    }
    public static boolean containsValue(int[] array,int value){
        for (int element :array){
            if (element == value) {
                return true;
            }
        }
        return false;
    }
}
