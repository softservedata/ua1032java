package com.softserve.Homework_condstate;
import java.util.Scanner;

public class Faculty {
    enum Season {
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Autumn"),
        WINTER("Winter");

        private final String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonName() {
            return seasonName;
        }
    }

    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season (0 for Spring, 1 for Summer, 2 for Autumn, 3 for Winter): ");
        int seasonCode = scanner.nextInt();

        Season currentSeason = getSeason(seasonCode);

        if (currentSeason != null) {
            Faculty faculty = new Faculty(numberOfStudents, currentSeason);
            System.out.println("Number of Students: " + faculty.getNumberOfStudents());
            System.out.println("Current Season: " + faculty.getCurrentSeason().getSeasonName());
        } else {
            System.out.println("Invalid season code.");
        }
    }

    public static Season getSeason(int seasonCode) {
        for (Season season : Season.values()) {
            if (season.ordinal() == seasonCode) {
                return season;
            }
        }
        return null;
    }
}
