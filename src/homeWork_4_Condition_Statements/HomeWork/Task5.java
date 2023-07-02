package homeWork_4_Condition_Statements.HomeWork;

public class Task5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack", "Terier", 2);
        Dog dog2 = new Dog("Jacky", "Doberman", 3);
        Dog dog3 = new Dog("Lacky", "Husky", 4);

        Dog [] arrayDog = {dog1,dog2,dog3};
        int max = 0;

        for (Dog dog:
             arrayDog) {
            if(max<dog.getAge())max=dog.getAge();
        }

        for (Dog dog:
                arrayDog) {
            if(max == dog.getAge()) System.out.println("The oldest dog is : "+dog.getName());;
        }





        if (dog1.getName().equals(dog2.getName())){
            System.out.println("dog1 and dog2 have same name");
        }else if (dog2.getName().equals(dog3.getName())){
            System.out.println("dog2 and dog3 have same name");
        }else if (dog1.getName().equals(dog3.getName())){
            System.out.println("dog1 and dog3 have same name");
        }else System.out.println("all dogs have different names");





    }
}
