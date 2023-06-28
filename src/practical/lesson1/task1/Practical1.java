// Practical 1
package practical.lesson1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical1 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type three words: ");
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        System.out.print("Reversed text:\n" + s3 + "\n" + s2 + "\n" + s1);
    }
}
