package homework.lesson5.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsTest {
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    @Test
    public void isNumberCorrect(){

        int expected=28;
        int actual=0;
        String chosenMonth="February".toLowerCase();

        switch(chosenMonth){
            case "january":
                actual = daysInMonth[0];
                break;
            case "february":
                actual = daysInMonth[1];
                break;
            case "march":
                actual = daysInMonth[2];
                break;
            case "april":
                actual = daysInMonth[3];
                break;
            case "may":
                actual = daysInMonth[4];
                break;
            case "june":
                actual = daysInMonth[5];
                break;
            case "july":
                actual = daysInMonth[6];
                break;
            case "august":
                actual = daysInMonth[7];
                break;
            case "september":
                actual = daysInMonth[8];
                break;
            case "october":
                actual = daysInMonth[9];
                break;
            case "november":
                actual = daysInMonth[10];
                break;
            case "december":
                actual = daysInMonth[11];
                break;

        }
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void doesDefaultWork() {
        String expected = "Error : no such month";
        String actual="null";
        String chosenMonth="CallingError".toLowerCase();

        switch(chosenMonth){
            case "CallingError":
                actual = ("It doesn't work");
            default:
                actual = ("Error : no such month");
        }
        Assertions.assertEquals(expected, actual);
    }
}
