package practicalTaskTwo;

/* Realize next structure of classes.
 In abstract class Person with property name, declare abstract method print().
 In other extended classes in body of method print() output text “I am a ...”.
 In class Staff declare abstract method salary().
 In each concrete class create constant TYPE_PERSON.
 Output type of person in each constructor.
 In main() method create an array of Person and add some Teachers, Cleaners and Students.
 Call method print() for all of it. Call method salary() for all Teachers and Cleaners.*/

public class TaskTwoTest {
    public static void main(String[] args) {
        Person[] pArr = new Person[6];
        pArr[0] = new Student("Iryna");
        pArr[1] = new Student("Roman");
        pArr[2] = new Teacher("Anna");
        pArr[3] = new Teacher("Vika");
        pArr[4] = new Cleaner("Daria");
        pArr[5] = new Cleaner("Nika");
        for(Person pers : pArr) {
            pers.print();
            System.out.println();
            if(pers instanceof Staff) {
                ((Staff) pers).salary();
            }
        }
    }
}
