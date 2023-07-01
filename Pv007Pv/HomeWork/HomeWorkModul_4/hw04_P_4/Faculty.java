package hw04_P_4;

/**
 * 4.* Create a class called Faculty and input the information about the number of students (using
 * the console) and the current season (using enum). Each season must have a name in English
 * (use the constructor). In main() method, check the correct operation of the code.
 */

/**
 * The Faculty class represents a faculty in an educational institution.
 */
public class Faculty {
    private String name;
    private static final String  faculty= "FIT";
    private static int k = 0;

    /**
     * Constructs a Faculty object with the given name.
     */
    public Faculty(String name) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("You have created the object Student of the Faculty of Information Technologies.");
        this.name = name;
        k ++;
    }

    /**
     * Returns the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of students in the faculty.
     */
    public static int getNumberStudents() {
        return k;
    }

    /**
     * Sets the name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the Faculty object.
     */
    @Override
    public String toString() {
        return "Information about student"  + "\n"  + '{' +
                "               Student: " + name + "\n"  +
                "Studies at the faculty: " + faculty + "\n"  +
                "At the faculty of studying " + k + " students." +
                '}';
    }

    public static void main(String[] args) {
        // Create Faculty objects representing students
        Faculty student1 = new Faculty("Ivan");
            Faculty student2 = new Faculty("Nino");
                Faculty student3 = new Faculty("Vano");
                    Faculty student4 = new Faculty("Vano");

        System.out.println("-------------------------------------------");

        // Demonstrate the use of the Faculty class
        System.out.println("The Faculty of Information Technologies has " +
                getNumberStudents() + " students.");
        System.out.println("-------------------------------------------");
        System.out.println(student1);
        System.out.println("-------------------------------------------");

        // Demonstrate the usage of the Season enum
        Season season = Season.SPRING;
        System.out.println(season.getSeason());
        System.out.println("-------------------------------------------");
        System.out.println(season);
        System.out.println("-------------------------------------------");
        System.out.println("April is " + Season.getSeasonByMonth("April"));
        System.out.println("-------------------------------------------");
        System.out.println("Current season: " + Season.getCurrentSeason());
        System.out.println("-------------------------------------------");
    }
}
