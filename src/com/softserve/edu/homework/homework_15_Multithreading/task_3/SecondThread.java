package com.softserve.edu.homework.homework_15_Multithreading.task_3;

public class SecondThread {
    public static Thread secondThread() {
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two.");
                }
            }
        });
        return thread2;
    }
}
