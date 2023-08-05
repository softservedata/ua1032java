package com.softserve.edu.homework.homework_15_Multithreading.task_1;

public class ThirdThread {
    public static Thread thirdThread() {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 3: Message " + (i + 1));
                }
            }
        });
        return thread3;
    }
}