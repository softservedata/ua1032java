package com.softserve.edu01rect;

public class Rectangle {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getArea() {
        return w * h;
    }
}
