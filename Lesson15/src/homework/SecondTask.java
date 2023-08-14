package homework;

public class SecondTask {
    public static void main(String[] args) {
        Object lock1 =new Object();
        Object lock2=new Object();

        Thread thread1 =new Thread(()->{
            System.out.println("thread 1 work");
            synchronized (lock1){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread 1 end!");
        });
        Thread thread2=new Thread(()->{
            System.out.println("thread 2 work");
            System.out.println("Thread 2 end!");
        });
        thread1.start();
        thread2.start();
    }
}
