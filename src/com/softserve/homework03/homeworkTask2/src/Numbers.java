public class Numbers {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Numbers(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public static int findSmallestNumber(Numbers numbers) {
        int smallestNumber;
        smallestNumber = Math.min(numbers.getFirstNumber(), Math.min(numbers.getSecondNumber(), numbers.getThirdNumber()));
        return smallestNumber;
    }
}



