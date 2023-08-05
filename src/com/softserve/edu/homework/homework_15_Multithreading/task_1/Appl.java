package com.softserve.edu.homework.homework_15_Multithreading.task_1;

public class Appl extends Thread {
    public static void main(String[]args) throws InterruptedException {

        Thread thread1 = FirstThread.firstThread();
        Thread thread2 = SecondThread.secondThread();
        Thread thread3 = ThirdThread.thirdThread();

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        thread3.start();
        thread3.join();


    }


}



