package com.softserve.java_homework.lesson15;

public class Task02{
    private static final Object LOCK = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK) {
                    System.out.println("Thread locked");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }));
        thread.start();
        synchronized (LOCK){
            System.out.println("Thread main locked");
            thread.join();
            Thread.sleep(1000);
        }
    }
}