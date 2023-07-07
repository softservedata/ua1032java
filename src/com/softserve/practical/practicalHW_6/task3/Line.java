package com.softserve.practical.practicalHW_6.task3;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                '}';
    }

    public String print() {
        return String.format("Line draw in %s and %s", pointOne.print(), pointTwo.print());

    }
}
