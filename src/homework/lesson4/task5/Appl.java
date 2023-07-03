package homework.lesson4.task5;

public class Appl {
    public static void main(String[] args) {
        Dog first = new Dog("Patron", Breed.JACK_RUSSEL, 6);
        Dog second = new Dog("Fred", Breed.BULLDOG, 2);
        Dog third = new Dog("Fred", Breed.SHEPHERD, 1);
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());

        if (first.getName().equals(second.getName()) || first.getName().equals(third.getName())){
            System.out.println("there are dogs with same names : " + first.getName());
        }
        else if (second.getName().equals(third.getName())) {
            System.out.println("there are dogs with same names : " + second.getName());
        }
        else{
            System.out.println("there are no dogs with same names");
        }

        if(first.getAge()>= second.getAge()&&first.getAge()>= third.getAge()){
            System.out.println(first.getName() + " is the oldest dog");
        }
        else if(second.getAge()>= first.getAge()&&second.getAge()>= third.getAge()){
            System.out.println(second.getName() + " is the oldest dog");
        }
        else {
            System.out.print(third.getName() +" is the oldest dog");
        }
    }
}
