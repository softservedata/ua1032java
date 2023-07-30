package homeWork_10_Colections_Part2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private static NameComparator nameComparator = new NameComparator();
    private static CourseComparator courseComparator = new CourseComparator();
    private String name;
    private int course;

    public static NameComparator getNameComparator() {
        return nameComparator;
    }

    public static CourseComparator getCourseComparator() {
        return courseComparator;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents(List<Student> listOfStudents, int course){
        Iterator<Student> iterator = listOfStudents.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getCourse()==course){
                System.out.println(student.getName());
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", course = " + course +
                '}';
    }

    public static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }
   public static class CourseComparator implements Comparator<Student>{
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse()-st2.getCourse();
        }
    }

}
