package com.softserve.practicals.p6.task3;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Line from " + startPoint.toString() + " to " + endPoint.toString();
    }

    public void print() {
        System.out.println("Line: " + toString());
    }
}
