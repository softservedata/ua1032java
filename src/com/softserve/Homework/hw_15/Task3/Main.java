package com.softserve.Homework.hw_15.Task3;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);

        Thread threadOne = new Thread(() -> {
            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                latch.countDown();
            });

            Thread threadThree = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });

            threadTwo.start();
            threadThree.start();
        });

        threadOne.start();

        latch.await();
    }
}
