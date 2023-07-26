package homeworkTaskTwo;

/* Create a class called Student which includes the following fields:
 name, group, course, and grades in different subjects.
 Create a collection that holds all objects. Write a methods that:
•  removes students with a grade point average of less than 3.
 If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
•  printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs.
This method should print out the names of the students who are enrolled in the specified course number to the console.
• In main() method create collection and output result. */

import java.util.ArrayList;
import java.util.List;

import static homeworkTaskTwo.Student.print;
import static homeworkTaskTwo.Student.removeStudents;

public class TestApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Integer> st1 = List.of(5, 5, 5, 3);
        List<Integer> st2 = List.of(2, 2, 3, 3);
        List<Integer> st3 = List.of(5, 4, 4, 3);
        List<Integer> st4 = List.of(2, 2, 2, 2);
        students.add(new Student("Iryna Vdovych", "CS-203", 2, st1));
        students.add(new Student("Roman Zozulia", "CS-204", 2, st2));
        students.add(new Student("Daria Shevchuk", "CS-208", 5, st3));
        students.add(new Student("Ihor Shevchuk", "CS-209", 4, st4));
        removeStudents(students);
        print(students, 1);
    }
}
