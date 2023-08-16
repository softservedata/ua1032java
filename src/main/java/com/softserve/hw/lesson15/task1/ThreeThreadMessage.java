package com.softserve.hw.lesson15.task1;

public class ThreeThreadMessage {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task1");
        var thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message ThreadOne number : " + i);
            }
        });
        var thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message ThreadTwo number : " + i);
            }
        });
        var thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message ThreadThree number : " + i);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}

