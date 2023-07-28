package hw12_P_3.hw_12_P_3_1.HomeWorkModul_1.hw01_P2_2;

import java.util.Scanner; // Import the Scanner class from the java.util package

/**2. Define two String variables name and address.
 * Output question "What is your name? to the console.
 Read the value of name and output next question: “Where do you live, (name)?“ to the console.
 Read the value of address from the console and output the complete information.*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("What is your name?: ");
            String name = input.nextLine();

            System.out.println("Where do you live, " + name + "?: ");
            String address = input.nextLine();

            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the input.");
        } finally {
            input.close();
        }
    }
}
