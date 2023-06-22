/**2. Define two String variables name and address.
 * Output question "What is your name?
        to the console.
 Read the value of name and output next question: “Where do you live,
        (name)?“ to the console.
 Read the value of address from the console and output the
        complete information.*/

// Import the Scanner class from the java.util package
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);
        // Outputting a request for a username.
        System.out.println("What is your name ?: ");
        // Reading a sting entered by the user as a name.
        String name = input.nextLine();
        // Outputting a request about the user's place of residence.
        System.out.println("Where do you live " + name + "?: ");
        // Reading the string entered by the user as the place of residence
        String address = input.nextLine();
        // Outputting the user's name and place of residence on new lines.
        System.out.println("Name: " + name + System.lineSeparator() +"Address: " + address );
    }
}