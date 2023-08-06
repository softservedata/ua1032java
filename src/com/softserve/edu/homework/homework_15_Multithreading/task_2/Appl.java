package com.softserve.edu.homework.homework_15_Multithreading.task_2;

import static com.softserve.edu.homework.homework_15_Multithreading.task_2.FirstDeadlockExample.threadFirst;
import static com.softserve.edu.homework.homework_15_Multithreading.task_2.SecondDeadlockExample.threadSecond;

public class Appl {
    final static Object first = new Object();
    final static Object second = new Object();

    public static void main(String[] args) {

        threadFirst.start();
        threadSecond.start();

        try {
            threadFirst.join();
            threadSecond.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of main()");
    }
}
