package com.softserve.edu.homework.homework_15_Multithreading.task_2;

import static com.softserve.edu.homework.homework_15_Multithreading.task_2.Appl.first;
import static com.softserve.edu.homework.homework_15_Multithreading.task_2.Appl.second;

public class FirstDeadlockExample {
    static Thread threadFirst = new Thread(() -> {

        synchronized (first) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (second) {
                System.out.println("Success FROM-threadFirst");
            }
        }

    });
}
