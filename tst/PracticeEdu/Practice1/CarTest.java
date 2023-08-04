package PracticeEdu.Practice1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarTest {
    @Test
    public void CarCheck(){
        Car[] car = new Car[2];

        car[0] = new Car("BMW");

        car[1] = new Car("Audi");

        Car[] car1 = {new Car("BMW"), new Car("Audi")};

        System.out.println(Arrays.equals(car, car1));
        Assertions.assertArrayEquals(car, car1);

        System.out.println(car.getClass());

    }


}
