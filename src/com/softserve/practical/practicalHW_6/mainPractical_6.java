package com.softserve.practical.practicalHW_6;

import com.softserve.practical.practicalHW_6.task2Car.Car;
import com.softserve.practical.practicalHW_6.task2Car.Sedan;
import com.softserve.practical.practicalHW_6.task2Car.Truck;
import com.softserve.practical.practicalHW_6.task3.ColorLine;
import com.softserve.practical.practicalHW_6.task3.Line;
import com.softserve.practical.practicalHW_6.task3.Point;

public class mainPractical_6 {
    public static void main(String[] args) {
/**-----------------------task2-------------------------*/
//        Truck truck = new Truck();
//        Sedan sedan = new Sedan();
//        Car[] cars = {truck,sedan};
//        for (Car c:cars) {
//            c.run();
//        }
/**-----------------------task3-------------------------*/
        Line[] lineArray = new Line[3];
        lineArray[0]=new Line(new Point(1,5),new Point(5,9));
        lineArray[1]=new ColorLine(new Point(8.5,5),new Point(8.9,9),"Black");
        lineArray[2]=new Line(new Point(100,8),new Point(-100,9));
        for (Line ln:lineArray) {
            System.out.println(ln.print());
        }
    }
}
