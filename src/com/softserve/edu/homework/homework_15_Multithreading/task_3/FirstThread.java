package com.softserve.edu.homework.homework_15_Multithreading.task_3;

public class FirstThread extends Thread {
    public static Thread firstThread() {
        Thread thread1 = new Thread(() -> {
            Thread thread2 = SecondThread.secondThread();
            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return thread1;
    }
}
