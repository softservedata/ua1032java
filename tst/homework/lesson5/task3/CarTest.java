package homework.lesson5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void CertainModelYearTest(){
        Car[] cars = new Car[1];
        cars[0] = new Car("Test", 2001, 5.0f);

        int expected = 2001;
        int actual=0;

        int chosenYear = 2001;



        for (int i = 2000; i<2023; i++){
            if (chosenYear==i){
                for (int j=0; j<cars.length; j++){
                    if (cars[j].getYearOfProduction()==chosenYear) {
                        actual = cars[j].getYearOfProduction();
                        break;
                    }
                    else {
                        actual = 9;
                    }
                }
            }
        }
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IsSortingTest(){
        boolean actual = false;

        Car[] cars = new Car[4];
        cars[0]= new Car("BMW", 2019, 3.0f);
        cars[1]= new Car("Mercedes", 2021, 6.3f);
        cars[2]= new Car("Audi", 2015, 2.0f);
        cars[3]= new Car("Tesla", 2021, 270f);


        Car temp;
        for (int i=0; i<cars.length-1; i++){
            for (int j=i+1; j<cars.length; j++){
                if(cars[i].getYearOfProduction()<cars[j].getYearOfProduction()){
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }

        if (cars[0].getYearOfProduction()>=cars[1].getYearOfProduction() &&
                cars[1].getYearOfProduction()>=cars[2].getYearOfProduction()&&
                cars[2].getYearOfProduction()>=cars[3].getYearOfProduction())
        {
            actual=true;
        }
        Assertions.assertTrue(actual);
    }
}
