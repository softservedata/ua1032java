package com.softserve.edu.hw4.Homework10;
import java.util.Scanner;
enum  Season {
    //enum elements
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    //with constructor, we can write values into enum elements
    private Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Homework10 {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();

        Scanner scan = new Scanner(System.in);

        System.out.print("Write season: ");
        faculty.setCurSeason(Season.valueOf(scan.nextLine().toUpperCase()));


        System.out.print("Write number of students: ");
        faculty.setNumStd(scan.nextInt());

        System.out.println(faculty.getCurSeason() + ": " + faculty.getNumStd() + " Students");
        scan.close();
    }
}
