package com.softserve.practical.practical6.task2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("[Point]");
        System.out.println("\tx: " + x + " | y: " + y);
    }

    @Override
    public String toString() {
        return "Point { " +
                " x = " + x +
                ", y = " + y +
                " }";
    }
}
