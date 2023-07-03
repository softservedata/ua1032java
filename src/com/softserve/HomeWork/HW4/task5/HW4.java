package com.softserve.HomeWork.HW4.task5;

public class HW4 {
    public static boolean isSameName(Dog... dogs){
        for (int i = 0; i< dogs.length;i++){
            for (int j = i+1;j<dogs.length;j++){
                if(dogs[i].equals(dogs[j])){
                    return true;
                }
            }
        }
        return false;
    }

    public static Dog oldestDog(Dog... dogs){
        Dog x = dogs[0];
        for (Dog dog: dogs){
            if(dog.getAge() > x.getAge()){
                x = dog;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tom", Breed.LABRADOR, 1);
        Dog dog2 = new Dog("Bib", Breed.BULLDOG, 4);
        Dog dog3 = new Dog("Bob", Breed.GERMAN_SHEPHERD, 10);
        System.out.println("The same name "+ isSameName(dog1,dog2,dog3));
        System.out.println("The oldest dog is "+ oldestDog(dog1,dog2,dog3));


    }
}
