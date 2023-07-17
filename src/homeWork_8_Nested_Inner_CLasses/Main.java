package homeWork_8_Nested_Inner_CLasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1  =  new Student("Roman","Ivanenko",22,2);
        Student st2  =  new Student("Oleh","Ivanenko",23,3);
        Student st3  =  new Student("Roman","Petrenko",24,4);
        Student cloneOfSt1 = (Student) st1.clone();
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(cloneOfSt1);

        for (Student st:
             listOfStudents) {
            System.out.println(st.info());
            System.out.println(st.activiti());
        }

        cloneOfSt1.setCourseTaking(6);
        System.out.println("\n");
        System.out.println(cloneOfSt1.info());
        System.out.println(st1.info());

    }
}
