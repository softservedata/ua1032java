package com.softserve.hw.lesson15.task3;

public class ThreeThread {
    public static void main(String[] args) throws InterruptedException {
        Thread two = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
        });
        Thread one = new Thread(() -> {
            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number one");
            }
        });
        Thread three = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        });
        one.start();
        one.join();
        three.start();
        three.join();
    }
}
