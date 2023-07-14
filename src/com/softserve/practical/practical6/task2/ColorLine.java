package com.softserve.practical.practical6.task2;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }

    public void print() {
        System.out.println("[Color Line]");
        System.out.println("\tcolor: " + color);
        super.print();
    }

    @Override
    public String toString() {
        return "ColorLine { " +
                " color = '" + color + '\'' +
                " }";
    }
}
