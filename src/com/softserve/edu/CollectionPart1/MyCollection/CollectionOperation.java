package com.softserve.edu.CollectionPart1.MyCollection;


import java.util.*;

public class CollectionOperation implements ICollectionOperation<List, ArrayList, LinkedList<Integer>> {
    private Random random = new Random();
    @Override
    public void addRanElements(ArrayList myCollection) {
        for(int i = 0; i != 10; i++)
            myCollection.add(i, random.nextInt(-4,10));
    }

    @Override
    public void swapMaxMin(ArrayList myCollection) {
        int indexMax, indexMin;

        indexMax = myCollection.indexOf(Collections.max(myCollection)); // we search in which index max value is in collection

        indexMin = myCollection.indexOf(Collections.min(myCollection));

        Collections.swap(myCollection, indexMax, indexMin);
    }

    @Override
    public void addDigitElementsAftNegative(ArrayList myCollection) {
        int num;
        int ranNum;
        for(int i = 0; i != myCollection.size(); i++) {
            num = (int) myCollection.get(i);
            if(num < 0) {

                for(int j = i, k = 0; k != 3; j++, k++) {
                    ranNum = random.nextInt(10);
                    myCollection.add(j, ranNum);
                    System.out.print(ranNum + "\t");
                }
                break;
            }
        }
        System.out.println();
    }
    private class Checker{
        private boolean checkNegAndPos(int num1, int num2) {
            if((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
                return true;
            }
            return false;
        }
        private boolean checkEvenNumExist(List<Integer> list, ArrayList<Integer> enumIndexNum){
            int j = 0;
            for(int i = 0; i != list.size(); i++){
                if ((list.get(i) % 2 == 0) && (list.get(i) != 0)){
                    enumIndexNum.add(i);
                    j++;
                }
            }
            if(j > 1){
                return true;
            }
            return false;
        }
        private boolean checkIfMinElemLast(List<Integer> list){
            if(list.indexOf(Collections.min(list)) == list.size() - 1)
                return true;
            return false;
        }

    }


    @Override
    public void insertZeroBetweenPosAndNeg(ArrayList myCollection) {
        int sizeArr = myCollection.size();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0, j = 1; j + 1 <= sizeArr; i++, j++) {
            if (new Checker().checkNegAndPos((int) myCollection.get(i), (int) myCollection.get(j))) {
                numbers.add(j);
            }

        }

        for(int j = 0; j < numbers.size() && numbers.size() != 0; j++) {
            myCollection.add(numbers.get(j), 0);
            for (int i = j; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) + 1); // add +1 to element
            }
        }
    }
    @Override
    public List firstElements(ArrayList list, int k){
        return list.subList(0, k);
    }

    @Override
    public List lastElements(ArrayList list, int k){
        return list.subList(k, list.size());
    }

    @Override
    public void removeLastEvenElement(ArrayList list){
        ArrayList<Integer> enumIndexNum = new ArrayList<>();
        int num;
        if(new Checker().checkEvenNumExist(list, enumIndexNum)){
            System.out.println(enumIndexNum);
            num = enumIndexNum.get(enumIndexNum.size() - 1);
            list.remove(num);

        }else
            System.out.println("there is no even number in list");

    }

    @Override
    public void removeElemAfterMin(LinkedList<Integer> list){
        if(new Checker().checkIfMinElemLast(list) == false){
            int index = list.indexOf(Collections.min(list)) + 1;
            list.remove(index);
        }else
            System.out.println("Min element is last");
    }

}
