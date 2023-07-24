package homework.lesson10.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
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

    public static void printStudents (List <Student> students, int course){
        System.out.println("Students from course " + course + ':');
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.getName().compareTo(otherStudent.getName());
    }

    public int compareByCourse (Student otherStudent) {
        return Integer.compare(this.getCourse(), otherStudent.getCourse());
    }
}
