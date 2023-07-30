package homeWork_10_Colections_Part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Student> listOfSudents = new ArrayList<>();
        listOfSudents.add(new Student("Roman",1));
        listOfSudents.add(new Student("Ira",2));
        listOfSudents.add(new Student("Petro",3));
        listOfSudents.add(new Student("Ivan",2));
        listOfSudents.add(new Student("Vasyl",5));

        listOfSudents.get(0).printStudents(listOfSudents,2);

        listOfSudents.sort(Student.getNameComparator());
        System.out.println(listOfSudents);

        listOfSudents.sort(Student.getCourseComparator());
        System.out.println(listOfSudents);






    }
}
