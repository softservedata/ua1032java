package homeworkTaskTwo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
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

    public List<Integer> getGrades() {
        return grades;
    }

    public double avgGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int size = grades.size();
        for (int i = 0; i < size; i++) {
            sum += grades.get(i);
        }
        return (double) sum / size;
    }

    public static void removeStudents(List<Student> students) {
        List<Student> niceStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.avgGrade() >= 3) {
                int currCourse = student.getCourse();
                student.course = currCourse + 1;
                niceStudents.add(student);
            }
        }
        students.clear();
        students.addAll(niceStudents);
    }

    public static void print(List<Student> students, int course) {
        System.out.println("~The students applied in a course " + course + ":");
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Course: " + student.getCourse());
        }
    }
}
