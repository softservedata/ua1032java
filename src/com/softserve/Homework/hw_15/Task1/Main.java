package com.softserve.Homework.hw_15.Task1;


import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: Hello!");
            }
            latch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: World!");
            }
            latch.countDown();
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3: Goodbye!");
            }
        });

        thread1.start();
        thread2.start();

        latch.await();
        thread3.start();
    }
}

