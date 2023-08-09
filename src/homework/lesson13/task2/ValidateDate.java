package homework.lesson13.task2;

import java.time.LocalDate;

public class ValidateDate {
    public static StringBuilder validateDate() {
        StringBuilder currentDate = new StringBuilder(String.valueOf(LocalDate.now()));
        StringBuilder date = new StringBuilder(currentDate.substring(5, 7) + "." +
                currentDate.substring(8, 10) + "." +
                currentDate.substring(0, 4));
        return date;
    }

    public static void main(String[] args) {
        System.out.println("Today is: " + validateDate());
    }
}
