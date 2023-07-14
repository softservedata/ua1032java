package com.softserve.lesson06.pt06.task03;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point pointOne, Point pointTwo, String color) {
        super(pointOne, pointTwo);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine {" +
                "color = '" + color + '\'' +
                ", pointOne = " + pointOne +
                ", pointTwo = " + pointTwo +
                '}';
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Overriding method print() in class ColorLine");
    }
}
