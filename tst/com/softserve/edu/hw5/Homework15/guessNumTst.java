package com.softserve.edu.hw5.Homework15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class guessNumTst {
    @Test
    public void guessNTst(){
        GuessNum guessNum = new GuessNum();
        guessNum.setGuessNumber(5);
        String expected = "You found the number ";
        String actual = guessNum.guessN(5); // in the parameter we give random number 5

        Assertions.assertEquals(expected, actual);

        expected = "Too high";
        actual = guessNum.guessN(4);

        Assertions.assertEquals(expected, actual);


        expected = "Too low";
        actual = guessNum.guessN(6);

        Assertions.assertEquals(expected, actual);


        guessNum.setGuessNumber(10);
        expected = "Your number is bigger than 9";
        actual = guessNum.guessN(5);

        Assertions.assertEquals(expected, actual);


        guessNum.setGuessNumber(-1);
        expected = "Your number is less than 0";
        actual = guessNum.guessN(4);

        Assertions.assertEquals(expected, actual);



    }
}
