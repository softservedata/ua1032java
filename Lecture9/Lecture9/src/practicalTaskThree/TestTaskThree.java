package practicalTaskThree;

/* In main() method declare a collection myCollection of 10 integers and fill it (from the console or random):
• Find and save in list newCollection all positions of element more than 5 in the collection. Output newCollection to the console;
• Remove from collection myCollection elements, which are greater than 20. Output the result;
• Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position – xxx, value of element – xxx”
• Sort and print collection.
Use one or more of the next: List, ArrayList, LinkedList*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class TestTaskThree {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();

        Random rand = new Random();
        for(int k = 0; k < 10; k++) {
            int randNum = rand.nextInt(41) - 10;
            myCollection.add(randNum);
        }
        System.out.println("Random collection is: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for(int k = 0; k < myCollection.size(); k++) {
            int num = myCollection.get(k);
            if(num > 5) {
                //newCollection.add(k);
                newCollection.add(num);
            }
        }
        System.out.println("\nNew collection is (elements > 5): " + newCollection);

        for (int k = myCollection.size() - 1; k >= 0; k--) { //k-- Is for the element that took the place of the removed element.
            if (myCollection.get(k) > 20) {
                myCollection.remove(k);
            }
        }
        System.out.println("\nmyCollection with the removed elements (> 20): " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("\nmyCollection is now:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + " and element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("\nThe sorted collection is: " + myCollection);
    }
}
