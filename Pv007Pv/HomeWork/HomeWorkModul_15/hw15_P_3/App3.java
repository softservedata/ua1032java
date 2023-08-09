package hw15_P_3;

/**
 * 3. Create a thread «one», which would start the thread «two», which has to output its
 * number («Thread number two») 3 times and create thread «three», which would to
 * output message «Thread number three» 5 times.
 */

public class App3 {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadOne());
        threadOne.start(); // Start the first thread "one"
    }

    // The ThreadOne class represents the first thread
    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread number one started");

            Thread threadTwo = new Thread(new ThreadTwo());
            threadTwo.start(); // Start the second thread "two"

            try {
                threadTwo.join(); // Wait for the completion of thread "two"
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread threadThree = new Thread(new ThreadThree());
            threadThree.start(); // Start the third thread "three"
        }
    }

    // The ThreadTwo class represents the second thread
    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread number two started");

            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
        }
    }

    // The ThreadThree class represents the third thread
    static class ThreadThree implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread number three started");

            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }
}
