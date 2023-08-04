package com.softserve.edu.ArrayAndLoops.Homework15;

public class GuessNum {
    private int guessNumber;

    public int getGuessNum() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String guessN(int ranNum){
        if (guessNumber >= 0 && guessNumber <= 9 && guessNumber > ranNum)
            return "Too high";
        else if(guessNumber >= 0 && guessNumber <= 9 && guessNumber < ranNum)
            return "Too low";
        else if(guessNumber == ranNum)
            return "You found the number ";
        else if (guessNumber < 0)
            return "Your number is less than 0";
        else
            return "Your number is bigger than 9";
    }
}
