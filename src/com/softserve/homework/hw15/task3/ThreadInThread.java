package com.softserve.homework.hw15.task3;

public class ThreadInThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("thread 2");
                }
            });

            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread 3");
            }
        });

        thread3.start();

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

