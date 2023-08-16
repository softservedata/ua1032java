package com.softserve.Graduation.Class;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class ClassHelper {
    public static void printFruitsByColor(List<Fruit> fruitList, String color) {
        fruitList.stream()
                .filter(fruit -> fruit.getColor().equals(color))
                .forEach(fruit -> System.out.println(fruit.print()));
    }

    public static List<Fruit> sortListByName(List<Fruit> fruitList) {
        return fruitList.stream()
                .sorted(Comparator.comparing(Fruit::getName))
                .toList();
    }

    public static void printFile(List<Fruit> fruitList, File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Fruit fruit : fruitList) {
                bw.write(fruit.print());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializedObject(Fruit fruit, File file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(fruit);
            System.out.println("Serialization object complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializedList(List<Fruit> fruitList, File file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(fruitList);
            System.out.println("Serialization list complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserialized(File file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            Fruit fruitNew = (Fruit) inputStream.readObject();
            System.out.println("Deserialization object complete\n" + (fruitNew.print()));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializedList(File file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            @SuppressWarnings("unchecked")
            List<Fruit> listNew = (List<Fruit>) inputStream.readObject();
            System.out.println("Deserialization object complete");
            for (Fruit fruit : listNew) {
                System.out.println(fruit.print());
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

}
