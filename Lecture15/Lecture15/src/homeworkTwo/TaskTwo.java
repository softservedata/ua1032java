package homeworkTwo;

/* Cause a deadlock. Organize the expectations of ending a thread in main(),
   and make the end of the method main() in this thread.
   (тобто створити thread, на ньому викликати метод main у якому викликати метод join на цьому thread) */

public class TaskTwo {
    public static void main(String[] args) {
        Thread thread1 = Thread.currentThread();
        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
