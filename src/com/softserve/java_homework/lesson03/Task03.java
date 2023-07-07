package com.softserve.java_homework.lesson03;

public class Task03 {
    public static void main(String[] args) {
        Faculty[] faculties = new Faculty[5];
        faculties[0] = new Faculty(30, Faculty.Season.FALL);
        faculties[1] = new Faculty(35, Faculty.Season.SUMMER);
        faculties[2] = new Faculty(33, Faculty.Season.WINTER);
        faculties[3] = new Faculty(36, Faculty.Season.SPRING);
        faculties[4] = new Faculty(40, Faculty.Season.FALL);

        for (Faculty faculty : faculties) {
            System.out.println(faculty.toString());
        }
    }
}