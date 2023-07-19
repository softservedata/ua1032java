package practicalTaskOne;

/* Create a class called Department that contains a name field of String type and an address field of Address type.
• In the Department class, create an inner class called Address with has city
and street fields of String type and building field of type int.
• In main() method, create an instance for one department and initialize it.
• Then, create one more department by cloning previously created department and change
the city for this object.
• Output information about all departments to the console. */

public class TaskOneTest {
    public static void main(String[] args) {
        Department.Address depAddress = new Department.Address("Lviv", "Heroiv UPA", 71);
        Department dep1 = new Department("Softserve", depAddress);

        Department dep2 = new Department(dep1.getName(), dep1.getAddress().clone());
            dep2.getAddress().setCity("Kyiv");
        System.out.println("~Department #1:");
        dep1.print();
        System.out.println();
        System.out.println("~Department #2:");
        dep2.print();
    }
}