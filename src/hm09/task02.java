package hm09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    public int course;
    private String name;
    private String group;
    private List<Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>();
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

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}

class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Group A", 1));
        students.add(new Student("Bob", "Group B", 2));
        students.add(new Student("Charlie", "Group C", 3));
        students.add(new Student("David", "Group A", 2));
        students.add(new Student("Eve", "Group B", 3));

        // Add some grades for each student
        for (Student student : students) {
            int numGrades = (int) (Math.random() * 5) + 1; // 1 to 5 grades per student
            for (int i = 0; i < numGrades; i++) {
                int grade = (int) (Math.random() * 5) + 1; // Random grade from 1 to 5
                student.addGrade(grade);
            }
        }

        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        removeStudentsWithLowAverage(students);
        System.out.println("\nAfter Removing Students with Average Grade < 3:");
        for (Student student : students) {
            System.out.println(student);
        }

        int courseToPrint = 2;
        System.out.println("\nStudents Enrolled in Course " + courseToPrint + ":");
        printStudents(students, courseToPrint);
    }

    private static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
                // Automatically promote the student to the next course level
                student.course++;
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
