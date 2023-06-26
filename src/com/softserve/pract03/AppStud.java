package com.softserve.pract03;

public class AppStud {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Petro", 4.1);
        Student st3 = new Student("Ira", 4.5);
        //
        System.out.println("Avg = " + Student.avgRating(st1, st2, st3));
    }
}
