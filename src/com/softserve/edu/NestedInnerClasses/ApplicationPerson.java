package com.softserve.edu.NestedInnerClasses;

public class ApplicationPerson {
    public static void main(String[] args) {
        Student student = new Student(new FullName("Volodymyr", "Maksymiv"), 19, 3, "Computer Science");
        Student student1 = new Student(new FullName("Daria", "Sula"), 20, 3, "Computer Science");


        System.out.println(student.info());

        System.out.println(student1.info());

        Student newStudent = null;
        try {
            newStudent = (Student) student.clone();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        newStudent.changeName("Markiian", "Maksymiv");
        newStudent.setAge(16);
        newStudent.setCourse(1);
        newStudent.setSpecialization("Computer Systems");

        System.out.println(newStudent.info() + "\n" + newStudent.activity());

        System.out.println(student.info());
    }
}
