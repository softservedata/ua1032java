package hw13_P_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 2. Create method to validate date according to format "mm.dd.yy"
 * */
//Great job!
public class App2 {

    public static boolean isValidDateFormat(String dateStr) {
        // Define the date format as "mm.dd.yy"
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false); // Disable lenient parsing

        try {
            // Try parsing the date string using the specified format
            sdf.parse(dateStr);
            return true; // If parsing is successful, the date is valid
        } catch (ParseException e) {
            return false; // If parsing fails, the date is not valid
        }
    }

    public static void main(String[] args) {
        // Test the isValidDateFormat method
        String date1 = "07.26.23"; // Valid date
        String date2 = "13.32.21"; // Invalid date (month and day are out of range)
        String date3 = "08.07.2023"; // Invalid date (year format should be yy)

        System.out.println(date1 + " is a valid date: " + isValidDateFormat(date1));
        System.out.println(date2 + " is a valid date: " + isValidDateFormat(date2));
        System.out.println(date3 + " is a valid date: " + isValidDateFormat(date3));
    }
}

