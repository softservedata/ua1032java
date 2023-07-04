package homework.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOrProductTest {
    @Test
    public void FirstFiveTest(){
        int[] arr = {1,2,-3,4,5,6,7,8,9,10};
        boolean expected = false;
        boolean actual;

        boolean firstFivePositive = false;
        for (int i=0; i<5; i++){
            if (arr[i]>=0)
                firstFivePositive = true;
            else{
                firstFivePositive = false;
                break;
            }
        }
        actual = firstFivePositive;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SumTest() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int expectedSum = 15;
        int actualProduct;

        int sum = 0;
        for (int i=0; i<5; i++) {
            sum+=arr[i];
        }
        actualProduct = sum;
        Assertions.assertEquals(expectedSum, actualProduct);
    }

    @Test
    public void ProductTest(){
        int[] arr = {1,2,3,-4,5,1,2,1,-2,2};
        int expectedProduct = -8;
        int actualProduct;

        int product = 1;
        for (int i=5; i< arr.length; i++) {
            product*=arr[i];
        }
        actualProduct = product;
        Assertions.assertEquals(expectedProduct, actualProduct);
    }

}
