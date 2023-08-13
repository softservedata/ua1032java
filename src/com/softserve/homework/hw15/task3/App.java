package com.softserve.homework.hw15.task3;
/*
Create a thread �one�, which would start the thread �two�,
which has to output its number (�Thread number two�) 3 times and create thread �three�,
which would to output message �Thread number three� 5 times.

������� ���� �����, ���� �� �������� ���� ����,
���� ������� ������� ��� ����� (����� ����� ���) 3 ����
�� ������� ���� ����, ���� ������ ����������� ����� ����� ��� 5 ���� .

 */

public class App {

    Thread t2 = new Thread ( () -> {
        for (int i = 0; i < 3; i++) {
            System.out.println ( (i + 1) + ": Thread 2" );
        }
    } );
    Thread threeThreads = new Thread ( () -> {
        t2.start ( );
        try {
            t2.join ( );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }

        Thread t3 = new Thread ( new Runnable ( ) {
            public void run () {
                for (int i = 0; i < 5; i++) {
                    System.out.println ( (i + 1) + ": Thread number three" );
                }
            }
        } );

        t3.start ( );
        try {
            t3.join ( );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
    } );

    public static void main ( String[] args ) throws InterruptedException {
        App app = new App ( );
        Thread t3 = app.getThreeThreads ( );
        t3.start ( );
        t3.join ( );
    }

    public Thread getThreeThreads () {
        return threeThreads;
    }
}
