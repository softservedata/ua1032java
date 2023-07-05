package com.softserve.lesson04.hw04.task01;

import java.util.Scanner;

public class NumsInRange {
    private float numOne;
    private float numTwo;
    private float numThree;

    public NumsInRange() {

    }

    public NumsInRange(float numOne, float numTwo, float numThree) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.numThree = numThree;
    }

    public float getNumOne() {
        return numOne;
    }

    public void setNumOne(float numOne) {
        this.numOne = numOne;
    }

    public float getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(float numTwo) {
        this.numTwo = numTwo;
    }

    public float getNumThree() {
        return numThree;
    }

    public void setNumThree(float numThree) {
        this.numThree = numThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumsInRange that = (NumsInRange) o;

        if (Float.compare(that.numOne, numOne) != 0) return false;
        if (Float.compare(that.numTwo, numTwo) != 0) return false;
        return Float.compare(that.numThree, numThree) == 0;
    }

    @Override
    public int hashCode() {
        int result = (numOne != +0.0f ? Float.floatToIntBits(numOne) : 0);
        result = 31 * result + (numTwo != +0.0f ? Float.floatToIntBits(numTwo) : 0);
        result = 31 * result + (numThree != +0.0f ? Float.floatToIntBits(numThree) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NumsInRange{ " +
                "numOne= " + numOne +
                ", numTwo= " + numTwo +
                ", numThree= " + numThree +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first float number: ");
        this.numOne = scanner.nextFloat();
        System.out.println("Enter second float number: ");
        this.numTwo = scanner.nextFloat();
        System.out.println("Enter third float number: ");
        this.numThree = scanner.nextFloat();
        scanner.close();
    }

    public void checkTheRange() {
        if (this.numOne >= -5 && this.numOne <=5 && this.numTwo >= -5 &&
                this.numTwo <=5 && this.numThree >= -5 && this.numThree <=5) {
            System.out.println( "All of these float numbers are belong to the range [-5, 5]");
        }
        else {
            System.out.println( "One ore more float numbers does not belong to the range [-5, 5]");
        }
    }

}
