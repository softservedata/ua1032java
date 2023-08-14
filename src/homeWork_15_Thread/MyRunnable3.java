package homeWork_15_Thread;

public class MyRunnable3 extends Thread{
    @Override
    public void run() {
        for (int i =0; i<5; i++){
            System.out.println("3");
        }
        MyRunnable4 myRunnable4 = new MyRunnable4();
        myRunnable4.start();
    }
}
