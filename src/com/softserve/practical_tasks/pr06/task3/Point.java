package com.softserve.practical_tasks.pr06.task3;

abstract class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point x=" + x +", y=" + y + ';';
    }

    public abstract void print();
}

