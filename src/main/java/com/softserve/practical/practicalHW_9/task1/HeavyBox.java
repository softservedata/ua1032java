package com.softserve.practical.practicalHW_9.task1;

import java.util.List;

public class HeavyBox {
    private int weight;
    private String content;

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HeavyBox: " +
                "weight=" + weight +
                "content=" + content + "\n";
    }

    public void printInfo(List<HeavyBox> list) {
        for (HeavyBox hb : list) {
            System.out.println("Weight Box: \n" + hb.getWeight() + "Content Box: \n" + hb.content);
        }
    }
}
