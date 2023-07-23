package homeWork_9_Colections_Part1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DoSomethinkWithList {
    private List<Integer> list;
    public DoSomethinkWithList(List<Integer> list) {
        this.list = list;
    }

    public void addElements(Random r){
        System.out.println("add elements");
        for(int i=0; i<11; i++){
           list.add(r.nextInt(-10,10));
        }
        System.out.println(list);
    }

    public void swapMinMax(){
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        for (int i =0; i<list.size(); i++){
            if(list.get(i)==max){list.set(i,min);
                System.out.println("change max to min");
            }else if(list.get(i)==min){
                System.out.println("change min to max");
                list.set(i,max);}
        }
        System.out.println(list);
    }

    public void addRandomNumber(Random r ){
        for (Integer myCol : list) {
            if(myCol<0){
            list.add(list.indexOf(myCol),r.nextInt(-999,999));
               break;
            }
        }
        System.out.println(list);
    }
    public void addZeroBetweenNumber(){
        for (int i=1; i<list.size()-2; i++){
                if(( list.get(i)<0 && list.get(i+1)>0 )|| (list.get(i)>0 && list.get(i+1)<0) ){
                    list.add(i+1,0);
                }
            }
        if((list.get(0)<0 && list.get(1)>0)||(list.get(0)>0 && list.get(1)<0)){
            list.add(1,0);
        }
        if((list.get(list.size()-2)<0 && list.get(list.size()-1)>0)
                ||(list.get(list.size()-2)>0 && list.get(list.size()-1)<0)){
            list.add(list.size()-1,0);
        }
        System.out.println(list);
    }
    public void removeTheLastEvenElement(){
        System.out.println(list.size());
        int count  = 0;
        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i)%2 == 0){
                list.remove(i);
                System.out.println("remove Element at position "+ i);
                count=1;
                break;
            }
        }
        if(count==0){
            System.out.println("havent even vumber in List");
        }
        System.out.println(list);
    }
    public  void removeElementAfterMIN(){
        int min = Collections.min(list);
        if(list.indexOf(min) == list.size()-1){
            System.out.println("Do nothink");
        }else  {
            System.out.println("remove element at position "+(list.indexOf(min)+1));
            list.remove(list.indexOf(min)+1);
        }
        System.out.println(list);
    }
    public int getSize() {
        return list.size()-1;
    }
    public List<Integer> getListBeforeK(int k){
        List<Integer> subList = new ArrayList<>();
       for(int i=0; i<=k; i++){
         subList.add(list.get(i));
       }
       return subList;
    }
    public List<Integer> getListAfterK(int k){
        List<Integer> subList = new ArrayList<>();
        subList.addAll(list.subList(k+1, list.size()));

        Collections.reverse(subList);

        return subList;
    }


}
