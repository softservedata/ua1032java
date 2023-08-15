package com.softserve.Homework.hw_15.Task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            try {
                System.out.println("Thread 1: Acquired lock 1");
                lock2.lock();
                try {
                    System.out.println("Thread 1: Acquired lock 2");
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        });

        Thread thread2 = new Thread(() -> {
            lock2.lock();
            try {
                System.out.println("Thread 2: Acquired lock 2");
                lock1.lock();
                try {
                    System.out.println("Thread 2: Acquired lock 1");
                } finally {
                    lock1.unlock();
                }
            } finally {
                lock2.unlock();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
