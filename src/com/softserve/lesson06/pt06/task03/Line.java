package com.softserve.lesson06.pt06.task03;

public class Line {
    protected Point pointOne;
    protected Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    @Override
    public String toString() {
        return "Line {" +
                "pointOne = " + pointOne +
                ", pointTwo = " + pointTwo +
                '}';
    }

    public void print() {
        System.out.println("Method print() of class Line");
    }
}
