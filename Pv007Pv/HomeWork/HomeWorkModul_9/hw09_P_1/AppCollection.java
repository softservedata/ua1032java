package HomeWork.HomeWorkModul_9.hw09_P_1;

import java.util.*;

public class AppCollection {
    public static void main(String[] args) {

        //Declare collection myCollection of 10 integers and fill it random.
        List<Integer> myCollection = new ArrayList<>();
        CreateCollection(myCollection); // Generate a collection of random numbers.

        List<Integer> originalCollection = new ArrayList<>(myCollection); // Create a copy of the input list.

        System.out.println("myCollection ArrayList: " + originalCollection);


        // Swap the maximum and minimum elements in the list.
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        Integer maxMyCollection = Collections.max(myCollection); // Find the maximum element
        Integer minMyCollection = Collections.min(myCollection); // Find the minimum element

        int indexMaxMyCollection = myCollection.indexOf(maxMyCollection); // Find the index of the maximum element
        int indexMinMyCollection = myCollection.indexOf(minMyCollection); // Find the index of the minimum element

        Collections.swap(myCollection, indexMaxMyCollection, indexMinMyCollection); // Swap the maximum and minimum elements

        System.out.println("myCollection after swapping the minimum and maximum elements: " + myCollection);


        //Insert a random three-digit number before the first negative element of the list
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        Random random2 = new Random();
        int randomNum = random2.nextInt(900) + 100; // Generate a random three-digit number
        System.out.println("Random number to insert: " + randomNum);

        for (int i = 0; i < myCollection.size(); i++) { // Iterate through the collection
            if (myCollection.get(i) < 0) { // Check if the element is negative
                //negativeIndex = i;
                myCollection.add(i, randomNum); // Insert the random number at the negative element position
                break;
            }
        }
        System.out.println("myCollection after inserting a random number: " + myCollection);


        //Insert a zero between all neighboring elements collection myCollection with different signs
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < myCollection.size() - 1; i++) { // Iterate through the collection (except the last element)
            int currentElement = myCollection.get(i);
            int nextElement = myCollection.get(i + 1);

            tempList.add(currentElement);
            if ((currentElement < 0 && nextElement > 0) || (currentElement > 0 && nextElement < 0)) { // Check if the adjacent elements have opposite signs
                tempList.add(0); // Insert 0 between elements of opposite signs
            }
        }
        tempList.add(myCollection.get(myCollection.size() - 1)); // Add the last element of the collection to tempList

        myCollection.clear();
        myCollection.addAll(tempList); // Update myCollection with tempList

        System.out.println("myCollection after inserting zeros: " + myCollection);



        /*Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        list2 in reverse order.*/
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        int k = 5; // Number of elements to copy
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k)); // Copy the first k elements to list1

        List<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) { // Iterate through the collection in reverse order starting from the kth element
            list2.add(myCollection.get(i)); // Copy the remaining elements in reverse order to list2
        }

        System.out.println("Copied first " + k +
            " elements of myCollection to list1 in direct order: " + list1);
        System.out.println("The rest copied to list2 in reverse order: " + list2);


        /*In a list myCollection remove the last even element (if there are even elements in the list). If
        there is no such element, display a message.*/
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        boolean removed = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) { // Iterate through the collection in reverse order
            if (myCollection.get(i) % 2 == 0) { // Check if the element is even
                myCollection.remove(i); // Remove the last even element from myCollection
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Last even element removed from myCollection: " + myCollection);
        } else {
            System.out.println("There are no paired elements");
        }

        System.out.println("myCollection after finding and deleting the last paired element: " + myCollection);



        /*Remove from the list myCollection the element following the first minimum. If the minimum
        element is the last one, nothing needs to be removed.*/
        myCollection = new ArrayList<>(originalCollection); // Restore the original collection

        int minMyCollection2 = Collections.min(myCollection); // Find the minimum element
        int indexMinMyCollection2 = myCollection.indexOf(minMyCollection2); // Find the index of the first minimum element

        if (indexMinMyCollection2 < myCollection.size() - 1) { // Check if there is a next element
            myCollection.remove(indexMinMyCollection2 + 1); // Remove the element following the first minimum
            System.out.println("The element after the first minimum has been removed from myCollection: " + myCollection);
        } else {
            System.out.println("The minimum element is the last one, nothing is removed");
        }

        System.out.println("myCollection after removing the following from the first minimum: " + myCollection);
    }

    //The method fills the Collection with random numbers from -100 to 100.
    //don`t forget about naming conventions -> createCollection
    private static void CreateCollection(List<Integer> Collection) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(201) - 100; // Generate a random number in the range from -100 to 100
            Collection.add(number); // Add the number to the collection
        }
    }
}
/*
 * Variable Declarations:
 *
 * Instead of declaring the myCollection variable and then assigning it after a few operations,
 * you can declare it right before it's needed, which makes code more readable and maintainable.
 * Likewise, reassigning myCollection to the originalCollection is unnecessary.
 * Instead, you can operate on a new list, which will reduce the risk of mistakes if the program is expanded in the future.
 *
 * Comments:
 * remember that in real-world code, it's often preferable to use self-explanatory method names
 * and limit comments to only those parts of the code that are non-trivial or counter-intuitive.
 *
 * Performance Consideration:
 * Your solution is suitable for a collection of 10 integers.
 * If the collection's size was considerably larger,
 * there might be performance considerations to take into account,
 * especially when using operations that require shifting large portions of the list
 * (like inserting in the middle of an ArrayList).
 * In such cases, a LinkedList might be more efficient for certain operations.
 *
 * For consistency, you can also use Collections.reverse() when you need to reverse a list.
 *
 */