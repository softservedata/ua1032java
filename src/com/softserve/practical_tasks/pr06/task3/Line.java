package com.softserve.practical_tasks.pr06.task3;

public class Line extends Point {
    protected Point endPoint;

    public Line(int startX, int startY, int endX, int endY) {
        super(startX, startY);
        this.endPoint = new Point(endX, endY) {
            @Override
            public void print() {
                System.out.println(toString());
            }
        };
    }

    @Override
    public String toString() {
        return "Line from " + super.toString() + " to " + endPoint.toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
