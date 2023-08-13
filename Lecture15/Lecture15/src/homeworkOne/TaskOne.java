package homeworkOne;

/* Run three threads and output there different messages for 5 times.
   The third thread supposed to start after finishing working of the two previous threads. */

class MyThreads implements Runnable {
  String phrase;

    public MyThreads(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public void run() {
        for(int k = 0; k < 5; k++) {
            System.out.println(phrase + (k + 1));
        }
    }
}

class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThreads("first thread "));
        Thread t2 = new Thread(new MyThreads("second thread "));
        Thread t3 = new Thread(new MyThreads("third thread "));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
