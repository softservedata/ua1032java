package homework;

public class FirstTask {
    public static void main(String[] args) {
        Thread thread1 =new Thread(new MyRunnable("Thread First"));
        Thread thread2 =new Thread(new MyRunnable("Thread Second"));
        Thread thread3 =new Thread(new MyRunnable("Thread Third"));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
    }
}

class MyRunnable implements Runnable {
    private String text;

    public MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text + " - " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
