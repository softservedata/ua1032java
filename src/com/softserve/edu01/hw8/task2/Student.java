package com.softserve.edu01.hw8.task2;

public class Student {
    private int course;

    public Student(int course) {
        this.course = course;
    }
    public void info() {
        if (course == 1) {
            System.out.println("This student in 1 course");
        } else if (course == 2) {
            System.out.println("This student in 2 course");
        } else if (course == 3) {
            System.out.println("This student in 3 course");
        } else if (course == 4) {
            System.out.println("This student in 4 course");
        } else {
            System.out.println("Else variant");
        }
    }

    public String activity() {
        return "I study at university";
    }
}
