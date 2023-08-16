package com.softserve.practical.practicalHW_6.task3;

public class Point {
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String print(){
        return String.format("point draw in (%s,%s)",x,y);
    }
}
