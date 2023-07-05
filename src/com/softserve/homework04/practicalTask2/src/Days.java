import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть число, що відповідає дню тижня: ");
        int dayNumber = Integer.parseInt(br.readLine());
        var dayName = switch (dayNumber) {
            case 1 -> "Monday - Понеділок";
            case 2 -> "Tuesday — Вівторок";
            case 3 -> "Wednesday — Середа";
            case 4 -> "Thursday — Четвер";
            case 5 -> "Friday - Пятниця";
            case 6 -> "Saturday - Субота";
            case 7 -> "Sunday - Неділя";
            default -> "Введіть число від 1 до 7";

        };
        System.out.println(dayName);

    }
}