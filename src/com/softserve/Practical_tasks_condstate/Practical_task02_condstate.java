package com.softserve.Practical_tasks_condstate;
import java.util.Scanner;
public class Practical_task02_condstate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayNameEnglish = getDayNameEnglish(dayNumber);
        String dayNameSpanish = getDayNameSpanish(dayNumber);

        System.out.println("Day in English: " + dayNameEnglish);
        System.out.println("Día en español: " + dayNameSpanish);
    }

    public static String getDayNameEnglish(int dayNumber) {
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        if (dayNumber >= 1 && dayNumber <= 7) {
            return daysOfWeek[dayNumber - 1];
        } else {
            return "Invalid day number";
        }
    }

    public static String getDayNameSpanish(int dayNumber) {
        String[] diasDeLaSemana = {
                "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
        };

        if (dayNumber >= 1 && dayNumber <= 7) {
            return diasDeLaSemana[dayNumber - 1];
        } else {
            return "Número de día inválido";
        }
    }
}
