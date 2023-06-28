package practical.lesson3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Task1 {

    public static int  getTotal(int a, int b){
        return a+b;
    }

    public static int getAverage(int a, int b){
        int avg = getTotal(a, b) / 2;
        return avg;
    }
    public static int getNumber(String prompt) {
        int number = 0;
        for (int i = 0; i < prompt.length(); i++) {
            if (Character.isDigit(prompt.charAt(i))) {
                number = Integer.parseInt(String.valueOf(prompt.charAt(i)));
                break;
            }
        }
        return number;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first, second;
        System.out.print("Input first number: ");
        first = Integer.parseInt(br.readLine());
        System.out.print("Input second number: ");
        second = Integer.parseInt(br.readLine());

        System.out.println("Sum: " + getTotal(first, second));
        System.out.println("Average: " + getAverage(first, second));

        System.out.println("\tInput the prompt, you want to find number from: ");
        Scanner sc = new Scanner(System.in);
        String prompt = sc.nextLine();

        System.out.println("\tNumber from prompt: " + getNumber(prompt));









    }

}
