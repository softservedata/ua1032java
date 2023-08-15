package com.softserve.edu01.hw15.hw1;

public class MyThread extends Thread {
    private final String message;
    private final int pause;
    public MyThread(String message, int pause) {
        this.message = message;
        this.pause = pause;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException ignored) {
            }
            System.out.println("Thread " +
                    message);
        }
    }
}
class Example {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread("hello, from first thread", 100);
        Thread t2 = new MyThread("hello, from second thread", 200);
        Thread t3 = new MyThread("hello, from third thread",1100);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("bye, from everyone threads;)");
    }
}
