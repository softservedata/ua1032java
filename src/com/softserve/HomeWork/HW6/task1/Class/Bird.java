package com.softserve.HomeWork.HW6.task1.Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Bird {
    Color feathers;
    boolean layEggs;
    public Bird(Color feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public Bird(){
        feathers = Color.WHITE;
        layEggs = false;
    }
    public void input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        feathers = Color.input();

        String str = br.readLine();
        str = str.toLowerCase();
        layEggs = switch (str){
            case "yes" -> true;
            case "no" -> false;
            default -> false;
        };
    }

    @Override
    public String toString() {
        return "{" +
                " feathers: " + feathers +
                ", layEggs: " + layEggs +
                ", "+ fly() +
                " }";
    }

    public abstract String fly();
}
