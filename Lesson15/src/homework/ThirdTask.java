package homework;

public class ThirdTask {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadOne());
        threadOne.start();
    }
}

class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread number one ");
        Thread threadSecond = new Thread(new ThreadSecond());
        threadSecond.start();
        try {
            threadSecond.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread threadThree = new Thread(new ThreadThird());
        threadThree.start();

    }
}

class ThreadSecond implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
    }
}

class ThreadThird implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}

