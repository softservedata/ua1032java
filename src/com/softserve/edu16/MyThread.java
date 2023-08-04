package com.softserve.edu16;

public class MyThread extends Thread {
    private final int number;
    private final int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread " + number);
        }
    }
}

class Example {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 250);
        t1.start();
        t2.start();
        //t1.join();
        t2.join();
        System.out.println("Thread main");
    }
}

