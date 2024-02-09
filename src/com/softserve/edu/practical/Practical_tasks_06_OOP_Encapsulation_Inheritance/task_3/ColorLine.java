package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_3;

public class ColorLine extends  Line{
    String color;
    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }
    @Override
    public String toString() {
        return "ColorLine: " + startPoint + " to " + endPoint + " (Color: " + color + ")";
    }
    public void print() {
        System.out.println(toString());
    }
}
