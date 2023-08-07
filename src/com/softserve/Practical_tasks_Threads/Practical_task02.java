package com.softserve.Practical_tasks_Threads;

public class Practical_task02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds (3000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("My name is ...");
    }
}