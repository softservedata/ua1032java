package com.softserve.homework.homework15.task2;

public class Homework15_02 {
    // TODO: Cause a deadlock. Organize the expectations of ending a thread in main(),
    //  and make the end of the method main() in this thread.

    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 start");
            synchronized (lockA) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockB){

                }
            }
            System.out.println("Thread1 end!");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 start");
            synchronized (lockB) {
                synchronized (lockA) {

                }
            }
            System.out.println("Thread2 end!");
        });

        thread1.start();
        thread2.start();

        System.out.println("Thread main end!");
    }
}
