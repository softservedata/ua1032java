package Homework;

import java.util.Scanner;

public class Faculty {
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
    enum Season{
        Winter("Winter"),
        Spring("Spring"),
        Summer("Summer"),
        Autumn("Autumn");

        private String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "seasonName='" + seasonName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season (0 ~ spring, 1 ~ summer, 2 ~ autumn, 3 ~ winter): ");
        int seasonCode = scanner.nextInt();
        Season currentSeason;

        switch (seasonCode) {
            case 0:
                currentSeason = Season.Spring;
                break;
            case 1:
                currentSeason = Season.Summer;
                break;
            case 2:
                currentSeason = Season. Autumn;
                break;
            case 3:
                currentSeason = Season.Winter;
                break;
            default:
                System.out.println("Invalid season number!");
                currentSeason = Season.Winter;
                break;
        }
        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());
        scanner.close();
    }
}
