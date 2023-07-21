package com.softserve.edu.homework.homework04_condition_statements.task_4;

public class Main {
    public enum Season {
        SUMMER,AUTUMN,WINTER,SPRING
    }
    public static class opinion_in_voice{
    public  void Print_opinion_in_voice(Season season) {
            switch (season) {
                case SUMMER -> System.out.println("HAPPY SUMMER HOLIDAYS !!!");
                case AUTUMN -> System.out.println("HAVE A GOOD ACADEMIC YEAR !!!");
                case WINTER -> System.out.println("DRESS WARMER BECAUSE IT'S WINTER ON THE STREET  !!!");
                case SPRING -> System.out.println("THE END OF THE UNIVERSITY COURSE IS SOON :(");
            }
        }
    }
}
