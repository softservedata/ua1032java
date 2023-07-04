package homework;

import java.util.Scanner;


/* Create a class called Faculty and input the information about the number of students (using the console)
   and the current season (using enum). Each season must have a name in English (use the constructor).
   In main() method, check the correct operation of the code. */

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season (0 ~ spring, 1 ~ summer, 2 ~ autumn, 3 ~ winter): ");
        int seasonCode = scanner.nextInt();
        Season currentSeason;

        switch (seasonCode) {
            case 0:
                currentSeason = Season.SPRING;
                break;
            case 1:
                currentSeason = Season.SUMMER;
                break;
            case 2:
                currentSeason = Season.AUTUMN;
                break;
            case 3:
                currentSeason = Season.WINTER;
                break;
            default:
                System.out.println("Invalid season number!");
                currentSeason = Season.WINTER;
                break;
        }
        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());
        scanner.close();
    }

    enum Season {
        SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn"), WINTER("Winter");

        private String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        @Override
        public String toString() {
            return seasonName;
        }
    }
}
