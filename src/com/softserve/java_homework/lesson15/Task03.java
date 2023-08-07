package com.softserve.java_homework.lesson15;

public class Task03 {
    public static void main(String[] args) {
        Thread one = new Thread((new Runnable() {
            @Override
            public void run() {
                Thread two = new Thread((new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println("Thread number two");
                        }
                        Thread three = new Thread((new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.println("Thread number three");
                                }
                            }
                        }));
                        three.start();
                    }
                }));
                two.start();

            }

        }));
        one.start();
    }
}
