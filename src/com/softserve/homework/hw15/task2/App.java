package com.softserve.homework.hw15.task2;
/*
Cause a deadlock.
Organize the expectations of ending a thread in main(), and make the end of the method main() in this thread.

Викликати тупик.
Організуйте очікування завершення потоку в main() і зробіть кінець методу main() у цьому потоці.

 */

public class App {
    final static Object first = new Object ( );
    final static Object second = new Object ( );

    public static Thread thread1 = new Thread ( () -> {
        synchronized (first) {
            try {
                Thread.sleep ( 100 );
            } catch (InterruptedException ignored) {
            }
            synchronized (second) {
                System.out.println ( "DONE!" );
            }
        }
    } );

    public static Thread thread2 = new Thread ( () -> {
        synchronized (second) {
            try {
                Thread.sleep ( 100 );
            } catch (InterruptedException ignored) {
            }
            synchronized (first) {
                System.out.println ( "DONE!" );
            }
        }
    } );

    public static void main ( String[] args ) {
        thread1.start ( );
        thread2.start ( );
        try {
            Thread.sleep ( 100 );
        } catch (InterruptedException ignored) {
        }
        System.out.println ( thread1.getState ( ) );
        System.out.println ( thread2.getState ( ) );
    }
}