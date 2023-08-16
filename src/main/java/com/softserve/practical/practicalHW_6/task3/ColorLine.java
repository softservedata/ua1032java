package com.softserve.practical.practicalHW_6.task3;

public class ColorLine extends Line {
    private String colorLine;

    public ColorLine(Point pointOne, Point pointTwo, String colorLine) {
        super(pointOne, pointTwo);
        this.colorLine = colorLine;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "ColorLine='" + colorLine + '\'' +
                '}';
    }

    @Override
    public String print() {
        return super.print() + ", Color " + colorLine;
    }
}
