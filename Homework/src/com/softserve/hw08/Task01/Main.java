package com.softserve.hw08.Task01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
       Student st1 = new Student(new FullName("Mark", "Ivanov"), 18, 2);
       Student st2 = new Student(new FullName("Ron","Black"), 21, 4);
       //
        System.out.println("Info about st1 {" + st1.info() + "}");
        Student st3 = (Student) st1.clone();
        System.out.println("Info about st2 {" + st2.info() + "}");
        st3.setCourse(3);
        st3.setAge(20);
        st3.getFullName().setFirstName("Roman");
        System.out.println("Info about st3 {" + st3.info() + "}");
        //
        System.out.println("Activity st1 {" + st1.activity() + "}");
        System.out.println("Activity st2 {" + st2.activity() + "}");
    }
}
