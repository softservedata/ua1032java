import java.util.ArrayList;
import java.util.List;

public class PracticalTasks {
    public static void main(String[] args) {
        /* Task 1. Input two String variables. Verify if the first variable is a substring of the second variable.
    `   For instance, if you entered "SoftServe" and "SoftServe Academy", the expected result should be true.*/
        String s1 = "I love you";
        System.out.println(s1);
        String s2 = "I love you more";
        System.out.println(s2);
        boolean isSubstring1 = s2.indexOf(s1) != -1; //якщо збігу немає, то метод поверне -1
        System.out.println("\n" + isSubstring1);
        boolean isSubstring2 = s2.contains(s1);
        System.out.println(isSubstring2);

        /* Task 2. Input the last name, first name, and middle name as String variables on the console.
        The following outputs will be displayed on the console:
        • Last name and initial
        • First name
        • First name, middle name, and last name. */

        String lastName = "Vdovych";
        String firstName = "Iryna";
        String middleName = "Evheniivna";

        String lastNameInitial = lastName + " " + firstName.charAt(0) + "."; //charAt - отримати букву на n-ній позиції
        System.out.println("\nLast name and initial: " + lastNameInitial);

        System.out.println("First name: " + firstName);

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("First name, middle name, and last name: " + fullName);
        System.out.println();

        /* Task 3. The task requires validation of usernames using regular expressions.
        The username should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores.
        To accomplish this, input five different usernames in the main method
        and output a message to the console indicating whether each of the entered names is valid or not. */

        String reg = "^[a-zA-Z0-9_]{3,15}$";

        List<String> nicknames = new ArrayList<>();
        nicknames.add("Iryna_2004");
        nicknames.add("Iryna:");
        nicknames.add("Ірина");
        nicknames.add("I574Iryna");
        nicknames.add("!Iryna999");

        for (String nick : nicknames) {
            if (nick.matches(reg)) {
                System.out.println(nick + " is valid.");
            } else {
                System.out.println("Username is not valid. Try again!");
            }
        }
    }
}
