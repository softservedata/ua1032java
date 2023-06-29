package com.softserve.hw03.Task03;

import org.w3c.dom.ls.LSOutput;

enum Season{
    WINTER("Winter"){
    public Season nextSeason(){ return SPRING; }
    },
    SPRING("Spring"){
    public Season nextSeason(){ return SUMMER; }
    },
    SUMMER("Summer"){
        public Season nextSeason(){ return AUTUMN; }
    },
    AUTUMN("Autumn"){
        public Season nextSeason(){ return WINTER; }
    };
    private String name;

    private Season(String name) {
        this.name = name;
    }

    public abstract Season nextSeason();
}

public class Main {
    public static void main(String[] args) {
        Season season = null;
        String month = "March";
        switch(month){
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month\n");
                throw new IllegalArgumentException("Error: Invalid Argument");
        }
        System.out.println("season = " + season);
        System.out.println("Next season = " + season.nextSeason());


    }
}
