package com.softserve.homework.hw15.task1;
/*
Run three threads and output there different messages for 5 times.
The third thread supposed to start after finishing working of the two previous threads.

Запустіть три потоки та виведіть туди різні повідомлення 5 разів.
Третій потік має початися після завершення роботи двох попередніх потоків.

 */

public class App {
    public static Object monitor = new Object ( );

    public static void main ( String[] args ) {
        Runnable thread1 = new Thread1 ( );
        Runnable thread2 = new Thread2 ( );
        Thread t1 = new Thread ( thread1 );
        Thread t2 = new Thread ( thread2 );
        t1.start ( );
        t2.start ( );
        try {
            t1.join ( );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
            System.err.println ( "t1 error" );
        }
        try {
            t2.join ( );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
            System.err.println ( "t2 error" );
        }
        for (int i = 0; i < 5; i++) {
            System.out.println ( "Thread3 is running" + Thread.currentThread ( ) );
        }
        System.out.println ( "End main" );
    }
}