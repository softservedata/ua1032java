package com.softserve.edu.practical.Practical_tasks_06_OOP_Encapsulation_Inheritance.task_3;

public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
