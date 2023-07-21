package com.softserve.Homework.hw_8.task2;
import com.softserve.Homework.hw_8.task1.FullName;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException,CloneNotSupportedException {
        FullName fullName1 = new FullName("Yurii", "Flys");
        Student student1 = new Student(fullName1, 18, 1);

        FullName fullName2 = new FullName("John", "Snow");
        Student student2 = new Student(fullName2, 20, 2);

        Student student3 = (Student) student1.clone();
        student3.setCourse(3);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }

}
