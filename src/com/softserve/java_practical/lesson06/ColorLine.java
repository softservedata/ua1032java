package com.softserve.java_practical.lesson06;

public class ColorLine extends Line {
    Color color;

    public ColorLine(Point startPoint, Point endPoint, Color color) {
        super(startPoint,endPoint);
        this.color = color;
    }public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + " in " + getColor() + " color";
    }
}