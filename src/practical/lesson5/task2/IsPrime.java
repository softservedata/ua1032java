package practical.lesson5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int input = Integer.parseInt(br.readLine());
        boolean isPrime = false;
        if(input==1||input==2) isPrime = true;

        else {
            for (int i = 2; i < input-1; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
                else isPrime = true;
            }
        }

        System.out.println(input + " is a prime number?\nAnswer : " + isPrime);
    }
}
