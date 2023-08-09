package hw15_P_2;

/**
 * 2. Cause a deadlock. Organize the expectations of ending a thread in main(), and make
 * the end of the method main() in this thread.
 */

public class App2 {
    public static void main(String[] args) {
        // Create two objects for locking (locks)
        Object lock1 = new Object();
        Object lock2 = new Object();

        // Create the first thread
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1 is waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        // Create the second thread
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2 is waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish their work
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message after both threads have finished
        System.out.println("The main method has finished.");
    }
}
