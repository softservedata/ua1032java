package com.softserve.practical.practical6.task2;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("[Line]");
        a.print();
        b.print();
    }

    @Override
    public String toString() {
        return " Line { " +
                " a = " + a +
                ", b = " + b +
                " }";
    }
}
