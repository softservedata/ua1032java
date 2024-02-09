package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_3;

public class Appl {
    public static void main(String[]args){
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(1,2), new Point(3,4));
        lines[1] = new ColorLine(new Point(5, 6), new Point(7, 8), "Red");
        lines[2] = new Line(new Point(9, 10), new Point(11, 12));
        for (Line line : lines) {
            line.print();
        }
    }
}
