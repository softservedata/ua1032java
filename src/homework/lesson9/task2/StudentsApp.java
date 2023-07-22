package homework.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class StudentsApp {
    public static void promoteStudents(List<Student> students){
        for (int i = students.size()-1; i >= 0 ; i--){
            if (students.get(i).getAverageGrade() < 3) students.remove(i);
            else students.get(i).setCourse(students.get(i).getCourse() + 1);
        }
    }
    public static void printStudents(List<Student> students, int course){
        System.out.println("Students who enrolled to the course " + course + ':');
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getCourse() == course)
                System.out.println(students.get(i));
        }
    }

    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();

        students.add(new Student("Nazar", "PMA-11", 1, new int[]{5, 5, 5, 4}));
        students.add(new Student("Ivan", "PMA-11", 1, new int[]{3, 3, 4, 3}));
        students.add(new Student("Petro", "PMA-11", 1, new int[]{2, 2, 1, 4}));

        students.add(new Student("Semen", "PMA-21", 2, new int[]{3, 5, 4, 4}));
        students.add(new Student("Taras", "PMA-21", 2, new int[]{5, 3, 5, 3}));
        students.add(new Student("Vasyl", "PMA-21", 2, new int[]{1, 4, 2, 3}));



        promoteStudents(students);
        printStudents(students, 2);
        System.out.println();
        printStudents(students, 3);

    }
}
