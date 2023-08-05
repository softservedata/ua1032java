package com.softserve.practical.practical9.task1;

import java.util.List;

public class HeavyBox {
    int weight;
    List<String> contents;

    public HeavyBox(int weight, List<String> contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox { " +
                "weight = " + weight +
                ", contents = " + contents +
                " }";
    }
}
