package com.softserve.practical_tasks.pr12;

public class Rectangle {
    public static int  squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Negative values are allowed! ");
        }
        return a * b;
    }
}
