//Practical 4
package practical.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are You?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}