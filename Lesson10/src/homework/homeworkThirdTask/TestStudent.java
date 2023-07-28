package homework.homeworkThirdTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static homework.homeworkThirdTask.Student.printStudents;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Iryna Zozulia", "Math"));
        studentList.add(new Student("Roman Zozulia", "Physics"));
        studentList.add(new Student("Daria Shevchuk", "Chemistry"));
        studentList.add(new Student("Yulia Lisovska", "Biology"));
        studentList.add(new Student("Orest Koval", "Computer Science"));

        System.out.println("Students sorted by name:");
        Collections.sort(studentList);
        printStudents(studentList);

        System.out.println("\nStudents sorted by course:");
        Collections.sort(studentList, (s1, s2) -> s1.compareByCourse(s2));
        printStudents(studentList);
    }
}
