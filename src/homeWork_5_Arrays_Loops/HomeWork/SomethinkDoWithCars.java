package homeWork_5_Arrays_Loops.HomeWork;

public class SomethinkDoWithCars {



    public void getCarByYear(Car [] array, int year){

        int i=0;
        for(Car car : array){
            if(car.getYearOfProduction() == year){
                System.out.println(car);
               i=i+1;
            }
        }
        if(i==0){
            System.out.println("No car from this year");
        }
    }


    public Car[] sortCars(Car [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1].getYearOfProduction() < array[j].getYearOfProduction()) {
                    Car swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }
}
