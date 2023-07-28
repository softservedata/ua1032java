package homeworkTaskThree;

/* Create a class named Student that stores information about the student's name and course.
• The class should include properties to access these fields, a constructor with parameters,
and a method called printStudents that takes a List of students and an Integer representing the course number as arguments.
• This method should print the names of the students from the list who are enrolled in the specified course
to the console using an iterator.
• Additionally, add methods to compare students by name and by course.
• In the main() method, create a List named "students" and add five different Student
objects to it. Then, display the list of students sorted by name and sorted by course. */

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.Iterator;
        import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students enrolled in course " + targetCourse + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Iryna", 2));
        students.add(new Student("Romchyk", 2));
        students.add(new Student("Daria", 5));
        students.add(new Student("Orest", 1));
        students.add(new Student("Ihor", 6));

        System.out.println("\n~The list of students sorted by name: ");
        Collections.sort(students, Comparator.comparing(Student::getName));
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        System.out.println("\n~The list of students sorted by course:");
        Collections.sort(students, Comparator.comparingInt(Student::getCourse));
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }
    }
}
