package homework.lesson5.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Try to guess a number I generated for You!");
        do {
            Random random = new Random();
            int min = 1;
            int max = 5;
            int diff = max - min;
            int rand = random.nextInt(diff + 1);
            rand += min;

            int playerGuess = Integer.parseInt(br.readLine());
            if (playerGuess<rand) System.out.println("Too low, try again");
            else if (playerGuess>rand) System.out.println("Too high, try again");
            else{
                System.out.println("Correct! You won!");
                break;
            }
        }while(true);
    }
}
