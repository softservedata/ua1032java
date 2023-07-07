package com.softserve.practical_tasks.pr06.task3;

public class AppLine {
    public static void main(String[] args) {
        Line[] lines = new Line[4];
        lines[0] = new Line(1,1, 2, 2);
        lines[1] = new Line(4,4, 10, 4);

        lines[2] = new ColorLine(2,3, 5, 3, "black");
        lines[3] = new ColorLine(1,8, 8, 8, "purple");

        for (Line line : lines) {
            line.print();
        }

    }
}
