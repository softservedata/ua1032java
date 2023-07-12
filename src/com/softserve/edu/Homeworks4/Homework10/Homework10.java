package com.softserve.edu.Homeworks4.Homework10;
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();

        Scanner scan = new Scanner(System.in);

        System.out.print("Write season: ");
        faculty.setCurSeason(Season.valueOf(scan.nextLine().toUpperCase()));


        System.out.print("Write number of students: ");
        faculty.setNumStd(scan.nextInt());

        System.out.println(faculty.getCurSeason() + ": " + faculty.getNumStd() + " Students");
    }
}
