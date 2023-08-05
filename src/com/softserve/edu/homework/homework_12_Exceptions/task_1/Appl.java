package com.softserve.edu.homework.homework_12_Exceptions.task_1;

public class Appl {
    public static void main(String[] args) {
        try {
            System.out.println("Result : " + Division.div(124.398, 13.455));
        } catch (NumberFormatException e) {
            System.out.println("Error converting string to number.");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Please provide two double numbers as command-line arguments.");
        }catch (Exception e){
            System.err.println("Unknown error.");
        }finally {
            System.out.println("Finally block executed.");
        }
    }
}
