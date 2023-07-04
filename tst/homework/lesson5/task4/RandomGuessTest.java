package homework.lesson5.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomGuessTest {

    @Test
   public void OutOfRangeRandomTest(){

       Random random = new Random();
       int min = 1;
       int max = 5;
       int diff = max - min;
       int rand = random.nextInt(diff + 1);
       rand += min;

       int expected = rand;
       int actual = 6;
       Assertions.assertNotEquals(expected, actual);
    }

    @Test
    public void IsLoopWorking(){
        boolean expected = true;
        boolean actual = false;

        int counter = 0;


        do {
            Random random = new Random();
            int min = 1;
            int max = 5;
            int diff = max - min;
            int rand = random.nextInt(diff + 1);
            rand += min;

            int playerGuess;

            if (counter == 0) playerGuess = 7;
            else if (counter == 1) playerGuess = -5;
            else playerGuess = rand;


            if (playerGuess<rand) {
                counter++;
            }
            else if (playerGuess>rand) {
                counter++;
            }
            else{

                break;
            }
        }while(true);
        System.out.println(counter);
        if (counter==2) actual = true;

        Assertions.assertEquals(expected, actual);
    }

}
