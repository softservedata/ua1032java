package com.softserve.Homework_Collections_part01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

public class StudentCollection {
    public static void main(String[] args) {
        List<Student> studentCollection = new ArrayList<>();

        // Create and add students to the collection
        List<Double> grades1 = new ArrayList<>();
        grades1.add(4.5);
        grades1.add(3.8);
        grades1.add(4.2);
        studentCollection.add(new Student("John Smith", "Group A", 1, grades1));

        List<Double> grades2 = new ArrayList<>();
        grades2.add(3.2);
        grades2.add(3.5);
        grades2.add(3.9);
        studentCollection.add(new Student("Emily Johnson", "Group B", 2, grades2));

        List<Double> grades3 = new ArrayList<>();
        grades3.add(4.8);
        grades3.add(4.6);
        grades3.add(4.9);
        studentCollection.add(new Student("Michael Davis", "Group C", 3, grades3));

        // Remove students with GPA less than 3 and promote others
        removeLowPerformingStudents(studentCollection);

        // Print students enrolled in a specified course
        printStudents(studentCollection, 2);
    }

    private static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.getAverageGrade();
            if (averageGrade < 3.0) {
                iterator.remove();
            } else {
                // Promote student to next course level
                student.course++;
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in Course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}