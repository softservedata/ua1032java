package homeWork_5_Arrays_Loops.HomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        SomethinkDoWithCars sdwc  = new SomethinkDoWithCars();
        Car car1 = new Car("SUV", 2008, 2.3);
        Car car2 = new Car("Minivan", 2007, 2.4);
        Car car3 = new Car("Sedan", 2006, 2.5);
        Car car4 = new Car("Coupe", 2008, 2.6);

        Car[] arrayOfCars = {car1, car2, car3, car4};

        System.out.println("Enter year of production:");

        sdwc.getCarByYear(arrayOfCars,sc.nextInt());
        System.out.println("sorted array of cars by year of prodaction");
        System.out.println(Arrays.toString(sdwc.sortCars(arrayOfCars)));

        //
        //
        RandomNumberGame rng = new RandomNumberGame();
        rng.startGuessNumber();
        //
        //
        DoWhileLoop dwl = new DoWhileLoop();
        dwl.add();
        //
        //
        HowMAnyDaysOnThisMonth hmdotm = new HowMAnyDaysOnThisMonth();
        hmdotm.getMonthLength();
        //
        //
        InputFiveIntegerNumber ifin = new InputFiveIntegerNumber();
        ifin.inputFiveInt();
        //
        //
        TenIntegerNumber tin = new TenIntegerNumber();
        tin.inputArrayOfInt();

        sc.close();


    }
}
