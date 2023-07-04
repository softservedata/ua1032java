package homework.lesson5.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileTest {
    @Test
    public void IsLoopWorking(){
        int expected=4;
        int actual;
        String answer;
        int counter=-2;

        boolean end = false;
        do {
            ++counter;
            if(counter==4){
                answer="yes";
            } else if (counter==1) {
                answer="no";
            }
            else{
                answer="else";
            }

            switch (answer){
                case "yes":
                    end=true;
                    break;
                case "no":
                    end = false;
                    break;
                default:
                    break;
            }

        }while(end!=true);

        actual = counter;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void IsSumCorrect(){
        int expectedSum = 6;
        int actualSum;

        String answer;
        int counter=-1;

        boolean end = false;
        int sum=0;
        do {
            int first=1;
            int second=2;
            sum+=(first+second);

            ++counter;
            if(counter==1){
                answer="yes";
            } else if (counter==0) {
                answer="no";
            }
            else{
                answer="else";
            }

            switch (answer){
                case "yes":
                    end=true;
                    break;
                case "no":
                    end = false;
                    break;
                default:
                    break;
            }

        }while(end!=true);
        actualSum = sum;
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
