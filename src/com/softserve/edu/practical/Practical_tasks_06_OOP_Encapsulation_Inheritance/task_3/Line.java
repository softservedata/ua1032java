package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_3;

public class Line extends Point{
    Point startPoint, endPoint;
    public Line(Point startPoint, Point endPoint) {
        super(startPoint.x, endPoint.y);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    @Override
    public String toString() {
        return "Line: " + startPoint + " to " + endPoint;
    }
    public void print() {
        System.out.println(toString());
    }
}
