package com.softserve.homework.hw15.task1;

public class AppPrint {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new Thread((new PrintMessages("Thread 1", 100)));
        var thread2 = new Thread((new PrintMessages("Thread 2", 200)));
        var thread3 = new Thread((new PrintMessages("Thread 3", 150)));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}
