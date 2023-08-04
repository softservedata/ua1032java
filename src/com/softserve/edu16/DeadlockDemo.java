package com.softserve.edu16;

class DeadlockDemo extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();
    static Thread t1 = new Thread() {

        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {
                }
                synchronized (second) {
                    System.out.println("Success!");
                }
            }
        }
    };
    static Thread t2 = new Thread() {

        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(15);
                } catch (Exception e) {
                }
                synchronized (first) {
                    System.out.println("Success!");
                }
            }
        }
    };

    public static void main(String[] s) {
        t1.start();
        t2.start();
        try {
            Thread.sleep(30);
        } catch (Exception e) {
        }
        System.out.println(t1.getState()); // BLOCKED
        System.out.println(t2.getState()); // BLOCKED
    }
}
