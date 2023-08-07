package com.softserve.Homework_Threads;

public class Homework_task03 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread number one");
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });
            two.start();
            try {
                two.join(); // Wait for thread two to finish before continuing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
        });

        one.start();
    }
}