package com.softserve.java_homework.lesson15;

public class Task01 implements Runnable {
    private static final int MAX_ATTEMPTS = 5;
    private final int interval;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Task01(1000));
        Thread thread2 = new Thread(new Task01(1000));
        Thread thread3 = new Thread(new Task01(1000));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("Thread " + Thread.currentThread()
                .getName() + " finish.");
    }

     public Task01(int interval) {
        this.interval = interval;
     }

    @Override
    public void run() {
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread name: " + Thread.currentThread()
                    .getName());
        }
    }
}

