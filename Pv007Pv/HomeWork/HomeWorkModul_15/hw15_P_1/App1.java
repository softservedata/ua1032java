package hw15_P_1;

/**
 * 1. Run three threads and output there different messages for 5 times. The third thread
 * supposed to start after finishing working of the two previous threads
 */
public class App1 {
    public static void main(String[] args) {
        // Create two thread objects
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Start threads thread1 and thread2
        thread1.start();
        thread2.start();

        try {
            // Wait for threads thread1 and thread2 to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create the third thread object
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));
        // Start thread thread3
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        private String threadName;

        // Constructor, takes the thread name
        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                // Print a message with the thread name and message number
                System.out.println(threadName + ": Message " + (i + 1));
                try {
                    // Pause for 0.5 seconds between messages
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
