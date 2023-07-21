package com.softserve.edu.homework.homework08_Nested_Inner_classes.task_2;
import com.softserve.edu.homework.homework08_Nested_Inner_classes.task_1.FullName;
import java.io.IOException;
public class Appl {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        Student students1 = new Student(new FullName("Franco", "Columbu"), 20,3);
        Student students2 = new Student(new FullName("Dorian", "Yates"), 18,1);
        Student students3 = (Student) students1.clone();
        students3.setAge(19);
        students3.setCourse(2);

        System.out.println(students1.activity() +"\n"+ students1.info()+"\n");
        System.out.println(students2.activity() +"\n"+ students2.info()+"\n");
        System.out.println(students3.activity() +"\n"+ students3.info()+"\n");
    }
}
