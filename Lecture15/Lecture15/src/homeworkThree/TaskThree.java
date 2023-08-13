package homeworkThree;

/* Create a thread «one», which would start the thread «two»,
   which has to output its number («Thread number two») 3 times and create thread «three»,
   which would to output message «Thread number three» 5 times. */

public class TaskThree {
    public static void main(String[] args) {
        Thread tOne = new Thread(new ThreadOne());
        tOne.start();
    }
}

class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 1 ");

        Thread tTwo = new Thread(new ThreadTwo());
        tTwo.start();
        try {
            tTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread threadThree = new Thread(new ThreadThree());
        threadThree.start();
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2 ");
        }
    }
}

class ThreadThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3 ");
        }
    }
}
