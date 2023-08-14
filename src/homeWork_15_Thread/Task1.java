package homeWork_15_Thread;

public class Task1 {
    public static void main(String[] args) {
        MyRunnable thread1 = new MyRunnable(1);
        MyRunnable thread2 = new MyRunnable(2);
        MyRunnable thread3 = new MyRunnable(3);
        thread1.setPriority(10);
        thread2.setPriority(5);
        thread3.setPriority(1);
        thread1.start();
        thread2.start();
        thread3.start();
        }
    }

