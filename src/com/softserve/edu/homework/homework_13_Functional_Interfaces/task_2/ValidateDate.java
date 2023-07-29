package com.softserve.edu.homework.homework_13_Functional_Interfaces.task_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateDate {
    public static void date() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter date in format \"mm.dd.yy\" : ");
            String input_date = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate inputDate = LocalDate.parse(input_date, formatter);

            LocalDate dateNow = LocalDate.now();
            if (inputDate.equals(dateNow)) {
                System.out.println("You entered the date correctly (づ ◕‿◕ )づ");
            } else {
                System.out.println("You entered the date incorrectly (づ◡﹏◡)づ");
            }
        } catch (DateTimeException e) {
            System.err.println("Date entered in bad format");
        } catch (Exception e) {
            System.err.println("Some other error");
        }
    }
}
