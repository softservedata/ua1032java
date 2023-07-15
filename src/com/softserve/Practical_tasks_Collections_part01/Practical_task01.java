package com.softserve.Practical_tasks_Collections_part01;

import java.util.ArrayList;

class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }
}

public class DynamicArrayExample {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        // Add boxes to the dynamic array
        boxes.add(new HeavyBox(10, "Box 1"));
        boxes.add(new HeavyBox(20, "Box 2"));
        boxes.add(new HeavyBox(30, "Box 3"));

        // Output contents using a for-each loop
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }

        // Change the weight of the first box by 1
        if (!boxes.isEmpty()) {
            HeavyBox firstBox = boxes.get(0);
            firstBox.weight += 1;
        }

        // Remove the last box
        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }

        // Output the updated contents using a for-each loop
        System.out.println("After modifications:");
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }

        // Remove all boxes
        boxes.clear();

        // Output the final result to the console
        System.out.println("After removing all boxes:");
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }
    }
}