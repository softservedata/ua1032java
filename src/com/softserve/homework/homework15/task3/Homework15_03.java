package com.softserve.homework.homework15.task3;

public class Homework15_03 {
    // TODO: Create a thread «one», which would start the thread «two»,
    //  which has to output its number («Thread number two») 3 times and create thread «three»,
    //  which would to output message «Thread number three» 5 times.

    public static Thread one = new Thread(() -> {
        System.out.println("\t" + Thread.currentThread().getName() + " run!");
        Homework15_03.two.start();
        System.out.println("\t" + Thread.currentThread().getName() + " end!");
    }, "Thread number one");

    public static Thread two = new Thread(() -> {
        System.out.println("\t" + Thread.currentThread().getName() + " run!");
        for(int i = 0; i < 3; i ++){
            System.out.println(Thread.currentThread().getName());
        }

        Thread three = new Thread(() -> {
            System.out.println("\t" + Thread.currentThread().getName() + " run!");
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println("\t" + Thread.currentThread().getName() + " end!");
        }, "Thread number three");

        three.start();
        System.out.println("\t" + Thread.currentThread().getName() + " end!");
    }, "Thread number two");

    public static void main(String[] args) {
        one.start();
    }
}
