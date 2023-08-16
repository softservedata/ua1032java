package hm13;

public class task03 {
    public static class LeapYearExample {
        public static void main(String[] args) {
            int year1 = 2020; //
            int year2 = 2022; //

            System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
            System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

}
