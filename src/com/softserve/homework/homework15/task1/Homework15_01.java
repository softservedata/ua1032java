package com.softserve.homework.homework15.task1;

public class Homework15_01 {
    // TODO: Run three threads and output there different messages for 5 times.
    //  The third thread supposed to start after finishing working of the two previous threads.

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("\tThread \"1\" run!");
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread \"1\" [" + i + "]");
            }
            System.out.println("\tThread \"1\" is dead!");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("\tThread \"2\" run!");
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread \"2\" [" + i + "]");
            }
            System.out.println("\tThread \"2\" is dead!");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("\tThread \"3\" run!");
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread \"3\" [" + i + "]");
            }
            System.out.println("\tThread \"3\" is dead!");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t3.start();

        System.out.println("\tThread \"main\" is dead");
    }
}
