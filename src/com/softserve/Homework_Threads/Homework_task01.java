package com.softserve.Homework_Threads;

public class Homework_task01  {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessagePrinter("Thread 1 says: Hello"));
        Thread thread2 = new Thread(new MessagePrinter("Thread 2 says: World"));
        Thread thread3 = new Thread(new MessagePrinter("Thread 3 says: Java"));

        // Start the first two threads
        thread1.start();
        thread2.start();

        try {
            // Wait for the first two threads to finish using join()
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the third thread after the first two finish
        thread3.start();

        try {
            // Wait for the third thread to finish using join()
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All threads have finished their work
        System.out.println("All threads have finished.");
    }
}

class MessagePrinter implements Runnable {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}