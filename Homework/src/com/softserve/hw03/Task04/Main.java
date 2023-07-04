package com.softserve.hw03.Task04;
import java.util.Scanner;
import java.util.Scanner;

enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;
    private Seasons(String name){
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty f = new Faculty();
        f.inputNumberOfStudents();
        System.out.print("Enter the season: ");
        String seasonName = sc.nextLine();
        Seasons season = Seasons.valueOf(seasonName);
        System.out.println("Season = " + season);
    }
}
