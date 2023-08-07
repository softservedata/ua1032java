package com.softserve.Practical_tasks_Threads;

public class Practical_task01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000); // Sleep for one second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}