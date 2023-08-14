package hm15;

public class task02 {
    public static class DeadlockExample {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Sub-thread has acquired the lock.");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sub-thread is now continuing.");
            }
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notify();
        }

        System.out.println("Main thread has finished.");
    }
}

}
