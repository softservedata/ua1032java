package homework.lesson8.task1and2;

public class PeopleApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person one = new Student("Petro", "Petrenko", 19, 2);
        Person two = new Student("Ivan", "Ivanenko", 21, 4);
        System.out.println(one.info());
        System.out.println(one.activity());
        System.out.println(two.info());
        System.out.println(two.activity());

        Student three = (Student) one.clone();
        three.setCourse(3);
        System.out.println("Cloned student one and changed course to 3");

        System.out.println(one.info());
        System.out.println(two.info());

        System.out.println(three.info());

    }
}
