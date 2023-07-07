package com.softserve.practical_tasks.pr06.task3;

public class ColorLine extends Line{

    private String color;

    public ColorLine(int startX, int startY, int endX, int endY, String color) {
        super(startX, startY, endX, endY);
        this.color = color;
    }

    @Override
    public String toString() {
    return "Color line: "+ super.toString() + " color: " + color;
    }
}
