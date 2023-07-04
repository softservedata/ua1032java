package homework.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondPositionTest {
    int[] arr = {1, -2, 3, 4, 5};

    @Test
    public void SecondPosTest(){

        int expected = 2;
        int actual;

        int counter=0;
        int secondPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                counter++;
            }
            if (counter==2){
                secondPos = i;
                break;
            }
        }
        actual = secondPos;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void MinValue(){

        int expectedVal = -2;
        int actualVal;

        int min = arr[0];
        int minPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                minPos = i;
            }
        }
        actualVal = min;

        Assertions.assertEquals(expectedVal,actualVal);
    }
    @Test
    public void MinPos() {
        int[] arr = {1, -2, 3, 4, 5};

        int expectedPos = 1;
        int actualPos;

        int min = arr[0];
        int minPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                minPos = i;
            }
        }
        actualPos = minPos;

        Assertions.assertEquals(expectedPos,actualPos);
    }

    @Test
    public void EvenProdTest(){
        int expectedProd = -8;
        int actualProd;

        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) prod *= arr[i];
            else if (arr[i]==0) continue;
        }
        actualProd = prod;
        Assertions.assertEquals(expectedProd,actualProd);
    }
}