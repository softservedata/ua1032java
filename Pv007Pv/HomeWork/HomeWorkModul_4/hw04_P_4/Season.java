package hw04_P_4;

import java.util.Calendar;
/**
 * The Season enum represents the seasons of the year.
 */
public enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String season;
    /**
     * Constructs a Season with the specified season name.
     */
    Season(String season) { this.season = season; }
    /**
     * Returns the name of the season.
     */
    public String getSeason() { return season; }

    /**
     * Returns the Season corresponding to the given month.
     */
    public static Season getSeasonByMonth(String month) {
        return switch (month.toLowerCase()) {
            case "december", "january", "february" -> Season.WINTER;
            case "march", "april", "may" -> Season.SPRING;
            case "june", "july", "august" -> Season.SUMMER;
            case "september", "october", "november" -> Season.AUTUMN;
            default -> null;
        };
    }
    /**
     * Returns the current Season based on the current month.
     */
    public static Season getCurrentSeason() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);

        return switch (month) {
            case 11, 0, 1 -> Season.WINTER;
            case 2, 3, 4 -> Season.SPRING;
            case 5, 6, 7 -> Season.SUMMER;
            case 8, 9, 10 -> Season.AUTUMN;
            default -> null;
        };
    }

    @Override
    public String toString() {
        return season;
    }
}







