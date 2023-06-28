package homework.lesson3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException{
        Person pr1 = new Person();
        Person pr2 = new Person();
        Person pr3 = new Person ("Petro", "Petrenko", 1956);
        Person pr4 = new Person ("Petro", "Petrenko");
        Person pr5 = new Person("Ivan", "Ivanov", 1978);
        Person pr6 = new Person();

        pr1.changeName("Nazar", "Nazarenko");

        pr2.setFirstName("Rostyslav");
        pr2.setLastName("Paternak");
        pr2.setBirthYear(2005);

        pr6.input();

        pr1.output();
        pr2.output();
        pr3.output();
        pr4.output();
        pr5.output();
        pr6.output();
    }
}
