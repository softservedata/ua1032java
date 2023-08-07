package com.softserve.edu.homework.homework_15_Multithreading.task_3;

public class Appl {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = FirstThread.firstThread();
        Thread thread3 = ThirdThread.thirdThread();

        thread1.start();
        thread1.join();
        thread3.start();
        thread3.join();


    }
}
