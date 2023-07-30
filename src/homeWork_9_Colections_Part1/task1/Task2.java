package homeWork_9_Colections_Part1.task1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Students> listOfStudens = new ArrayList<>();
        listOfStudens.add(new Students("Solomia","B1",2,4,5,4));
        listOfStudens.add(new Students("Roman","B1",1,3,5,4));
        listOfStudens.add(new Students("Taras","B1",3,2,2.8,2.5));
        listOfStudens.add(new Students("Ihor","B1",4,5,5,4));
        listOfStudens.add(new Students("Ivan","B1",3,4,5,3));
        listOfStudens.add(new Students("Petro","B1",2,3,3,3));
        Decanat decanat = new Decanat();

        decanat.removeBadStudents(listOfStudens);

        decanat.getNextCourseToStudents(listOfStudens);
        System.out.println("\n");
        System.out.println("\n");

        decanat.printStudents(listOfStudens,5);
    }
}
