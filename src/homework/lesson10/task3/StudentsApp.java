package homework.lesson10.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentsApp {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 1));
        students.add(new Student("Nazar", 1));
        students.add(new Student("Petro", 2));
        students.add(new Student("Taras", 2));
        students.add(new Student("Lev", 2));

        System.out.println("All Students list: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println("Name: " + students.get(i).getName() +
                                ", Course: " + students.get(i).getCourse());
        }

        Collections.sort(students);
        System.out.println("Sorted by name Students list: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println("Name: " + students.get(i).getName() +
                    ", Course: " + students.get(i).getCourse());
        }

        students.sort(Student::compareByCourse);
        System.out.println("Sorted by course Students list: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println("Name: " + students.get(i).getName() +
                    ", Course: " + students.get(i).getCourse());
        }

        Student.printStudents(students, 2);

    }
}
