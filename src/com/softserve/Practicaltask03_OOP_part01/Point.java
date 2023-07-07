package com.softserve.Practicaltask03_OOP_part01;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println("Point: " + toString());
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line from " + startPoint + " to " + endPoint;
    }

    public void print() {
        System.out.println("Line: " + toString());
    }
}

class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " [color: " + color + "]";
    }

    public void print() {
        System.out.println("ColorLine: " + toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(5, 5));
        lines[1] = new ColorLine(new Point(2, 3), new Point(6, 9), "red");
        lines[2] = new Line(new Point(1, 1), new Point(3, 3));

        for (Line line : lines) {
            line.print();
        }
    }
}