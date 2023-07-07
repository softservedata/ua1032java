package homeWork_4_Condition_Statements.homeWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Faculty facultyOfHistory = new Faculty();

        System.out.println("input season :");
        String season = sc.nextLine().toUpperCase();

        System.out.println("input number of students:");
        facultyOfHistory.setNumberOfTudents(sc.nextInt());

        facultyOfHistory.setSeason(Season.valueOf(season));

        System.out.println(facultyOfHistory.getNumberOfTudents());
        System.out.println(facultyOfHistory.getSeason());


    }
}
