package hm15;

import java.util.concurrent.Semaphore;

public class task01 {

    public static class ThreadExample {
        public static void main(String[] args) throws InterruptedException {
            Semaphore semaphore = new Semaphore(0);

            startThread(1, "Hello from Thread 1", semaphore);
            startThread(2, "Greetings from Thread 2", semaphore);

            semaphore.acquire(2);

            startThread(3, "Salutations from Thread 3", semaphore);

            semaphore.acquire();

            System.out.println("All threads have finished.");
        }

        private static void startThread(int threadId, String message, Semaphore semaphore) {
            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread " + threadId + ": " + message);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                semaphore.release();
            }).start();
        }
    }

}
