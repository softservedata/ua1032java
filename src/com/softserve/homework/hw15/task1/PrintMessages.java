package com.softserve.homework.hw15.task1;

public class PrintMessages implements Runnable {
    String message;
    int interval;

    public PrintMessages(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


