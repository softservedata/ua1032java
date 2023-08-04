package com.softserve.edu16.pr;

public class Print implements Runnable {
    String phrase;
    int interval;

    public Print(String phrase, int interval) {
        this.phrase = phrase;
        this.interval = interval;
    }

    @Override
    public void run() {
        for(int i = 0; i <5; i++){
            System.out.println(phrase);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Demo{
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Print("Hello world!", 2000));
        var t2 = new Thread(new Print("Peace to the peace!", 3000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is " + Thread.currentThread().getName());
    }
}