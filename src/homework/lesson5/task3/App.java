package homework.lesson5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException{
        Car[] cars = new Car[4];
        cars[0]= new Car("BMW", 2019, 3.0f);
        cars[1]= new Car("Mercedes", 2021, 6.3f);
        cars[2]= new Car("Audi", 2015, 2.0f);
        cars[3]= new Car("Tesla", 2021, 270f);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the year of production: ");
        int chosenYear = Integer.parseInt(br.readLine());

        for (int i = 2000; i<2023; i++){
            if (chosenYear==i){
               for (int j=0; j<cars.length; j++){
                   if (cars[j].getYearOfProduction()==chosenYear) {
                       System.out.print(cars[j].toString());
                   }
               }
            }
        }
        //sorting by year of production
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

        System.out.println("\n\nAll cars sorted by year:");

        for (int i=0; i<cars.length; i++){
            System.out.print(cars[i].toString());
        }




    }
}
