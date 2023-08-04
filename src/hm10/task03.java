package hm10;

import java.util.*;

public class task03 {
    static class Student{
        private String name;
        private int course;

        public Student (String name, int course){
            this.name= name;
            this.course= course;
        }
        public String getName(){
            return name;
        }
        public int getCourse(){
            return course;
        }
        public static void printStudents(List<Student> students,int targetCourse){
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
            }
        }
    public static Comparator<Student> nameComparator= Comparator.comparing(Student::getName);
    public static Comparator<Student> courseComparator = Comparator.comparing(Student::getCourse);
}
public static class Main{
        public static void main(String[]args){
            List<Student> students = new ArrayList<>();
            students.add(new Student("Alice", 2));
            students.add(new Student("Bob", 1));
            students.add(new Student("Charlie", 3));
            students.add(new Student("David", 2));
            students.add(new Student("Eve", 1));

            System.out.println("Students on course 2:");
            Student.printStudents(students, 2);

            System.out.println("\nStudents on course 1:");
            Student.printStudents(students, 1);

            Collections.sort(students, Student.nameComparator);
           // students.sort(Student.nameComparator);//can be used instead of Collections.sort
            System.out.println("\nStudents sorted by names:");
            for (Student student : students) {
                System.out.println(student.getName() + " - Course " + student.getCourse());
            }

            Collections.sort(students, Student.courseComparator);

            System.out.println("\nStudents sorted by courses:");
            for (Student student : students) {
                System.out.println(student.getName() + " - Course " + student.getCourse());
            }
        }
}
    }