package homeWork2;

public class FindSmallestNumber {
    private int [] array = new int [3];
    public void setArray0(int array0){
        this.array[0]= array0;
    }
    public void setArray1(int array1){
        this.array[1]= array1;
    }
    public void setArray2(int array2){
        this.array[2]= array2;
    }

    public int getSmallest(){
        int min = array[0];
        for ( int i : array){
            if (min>i){
                min = i;
            }
        }
        return min;
    }

}
