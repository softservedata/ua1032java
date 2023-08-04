package com.softserve.edu16;

public class Ex2 {
    public static int sum = 0;
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() ->
        {
            for (int j = 0; j < 10_000; j++)
                synchronized (LOCK) {
                    sum++;
                }
        }
        );
        var t2 = new Thread(() ->
        {
            for (int j = 0; j < 10_000; j++)
                synchronized (LOCK) {
                    sum--;
                }
        }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Sum is = " + sum);
    }
}
