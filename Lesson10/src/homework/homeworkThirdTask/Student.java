package homework.homeworkThirdTask;

import java.util.Iterator;
import java.util.List;

public class Student  implements Comparable<Student>{
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
        }
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
    }
    public int compareByCourse(Student otherStudent) {
        return this.course.compareTo(otherStudent.course);
    }


}
