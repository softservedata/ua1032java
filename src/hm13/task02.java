package hm13;

public class task02 {
    public static class DateValidationExample {
        public static void main(String[] args) {
            String date1 = "12.31.23";
            String date2 = "01.32.22";

            System.out.println(date1 + " is valid: " + isValidDate(date1));
            System.out.println(date2 + " is valid: " + isValidDate(date2));
        }

        public static boolean isValidDate(String date) {
            if (date == null || date.length() != 8) {
                return false;
            }

            try {
                int month = Integer.parseInt(date.substring(0, 2));
                int day = Integer.parseInt(date.substring(3, 5));
                int year = Integer.parseInt(date.substring(6, 8));

                return (month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year >= 0 && year <= 99);
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

}
