package homeWork_15_Thread;

public class MyRunnable2 extends Thread{
    @Override
    public void run() {
           MyRunnable3 myRunnable3 = new MyRunnable3();
           myRunnable3.start();
    }
}

