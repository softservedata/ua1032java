import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Task 1
        // TODO: Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius from the console, and output obtained results.
        System.out.println("Enter radius of flower bed");

        double radius = Double.parseDouble(br.readLine());
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of flower bed is " + area);
        System.out.println("Perimeter of flower bed is " + perimeter);

        //Task 2
        // TODO: Define two String variables name and address. Output question "What is your name? to the console. Read the value of name and output next question: “Where do you live, (name)?“ to the console. Read the value of address from the console and output the complete information. 
        String name, address;
        System.out.println("\nWhat is your name?");
        name = br.readLine();
        System.out.println("Where do you live?");
        address = br.readLine();
        System.out.println("Complete information:\nName: " + name + "\nAddress: " + address);
        
        //Task 3
        // TODO: Three phone calls were made from different countries, each with a different cost per minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the console, calculate the cost of each call and the total cost, and output the results to the console.
        double c1, c2, c3, t1, t2 , t3, amount1, amount2, amount3, total;
        System.out.println("\nEnter cost per minute №1:");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("Enter cost per minute №2:");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("Enter cost per minute №3:");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("Enter time of first call:");
        t1 = Double.parseDouble(br.readLine());
        System.out.println("Enter time of second call:");
        t2 = Double.parseDouble(br.readLine());
        System.out.println("Enter time of third call:");
        t3 = Double.parseDouble(br.readLine());

        amount1 = c1 * t1;
        amount2 = c2 * t2;
        amount3 = c3 * t3;
        total = amount1 + amount2 + amount3;

        System.out.println("\nComplete information about calls:");
        System.out.println("Amount for the first call: " + amount1 + "$");
        System.out.println("Amount for the second call: " + amount2 + "$");
        System.out.println("Amount for the third call " + amount3 + "$");
        System.out.println("Total: " + total + "$");
    }
}