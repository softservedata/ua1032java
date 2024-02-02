package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_1;

public class Array_task_2 {
    public static int[] intArray = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        double average = calculateAverage(intArray);
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = (double) sum / array.length;
        return average;
    }
}