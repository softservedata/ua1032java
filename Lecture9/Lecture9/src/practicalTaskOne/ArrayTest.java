package practicalTaskOne;

/* Create a dynamic array containing objects of the HeavyBox class which includes int weight and String contents fields.
Output its contents using for-each loop.
• Change the weight of the first box by 1.
• Remove the last box.
• Output result to the console. Remove all boxes and output result to the console. */

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<HeavyBox> myBoxes = new ArrayList<>();
        myBoxes.add(new HeavyBox(2, "#1 Box"));
        myBoxes.add(new HeavyBox(3, "#2 Box"));
        myBoxes.add(new HeavyBox(4, "#3 Box"));
        myBoxes.add(new HeavyBox(5, "#4 Box"));

        for(HeavyBox box : myBoxes) {
            System.out.println("~Box number is: " + box.contents + " and the weight is: " + box.weight + ".");
        }


        /* Option 1 to change the weight.
          for (HeavyBox box : myBoxes) {
            box.weight += 1;
            System.out.println();
            System.out.println("~The FIRST box weight is: " + box.weight + ".");
            break;
        }

          Option 2 to change the weight.
        myBoxes.get(0).weight += 1;  */

        HeavyBox firstBox = myBoxes.get(0);
        firstBox.weight += 1;
        System.out.println("\n~The FIRST box weight is: " + firstBox.weight + ".");

        //removing the last box
        myBoxes.remove(myBoxes.size() - 1);
        System.out.println("\nNew boxes list: ");
        for (HeavyBox box : myBoxes) {
            System.out.println("~Box number is: " + box.contents + " and the weight is: " + box.weight + ".");
        }

        //removing all elements
        myBoxes.clear();
        System.out.println("\nI have removed my boxes: ");
        for (HeavyBox box : myBoxes) {
            System.out.println("~Box number is: " + box.contents + " and the weight is: " + box.weight + ".");
        }
    }
}
