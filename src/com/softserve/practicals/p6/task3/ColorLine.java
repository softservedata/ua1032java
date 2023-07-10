package com.softserve.practicals.p6.task3;

public class ColorLine extends Line {
    private String color;

    public ColorLine ( Point startPoint, Point endPoint, String color ) {
        super( startPoint, endPoint );
        this.color = color;
    }

    public String getColor () {
        return color;
    }

    @Override
    public String toString () {
        return super.toString( ) + " (Color: " + color + ")";
    }

    public void print () {
        System.out.println("Color: " + toString());
    }
}
