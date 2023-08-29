package example;

import battle.BattleMTM;
import droid.Brave;
import droid.Defender;
import droid.Droid;
import droid.RandomPower;
import droid.Tricky;
import example.battle.BattleMTM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        mainMenu();
    }

    /**
     * method for user choosing any desired action 1-7
     */
    private static void mainMenu() {
        ArrayList<Droid> droids = new ArrayList<Droid>();
        BattleMTM btlMTM = new BattleMTM();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Виберіть дію:");
            System.out.println("\t1 - створити Дроїда.");
            System.out.println("\t2 - показати створених Дроїдів.");
            System.out.println("\t3 - розпочати поєдинок 1:1.");
            System.out.println("\t4 - розпочати поєдинок група на групу.");
            System.out.println("\t5 - зберегти поєдинок у файл.");
            System.out.println("\t6 - показати поєдинок з файлу.");
            System.out.println("\t7 - закінчити роботу.");
            int choice = sc.nextInt();

            switch (choice) {
                case 7:
                    return;
                case 1:
                    Droid d = createDroid();
                    if(d != null)
                        droids.add(d);
                    break;
                case 2:
                    btlMTM.showGroup(droids);
                    break;
                case 3:
                    conductBattleOTO(droids, btlMTM);
                    break;
                case 4:
                    conductBattleMTM(droids, btlMTM);
                    break;
                case 5:
                    saveBattleToFile(btlMTM);
                    break;
                case 6:
                    playBattleFromFile(btlMTM);
                    break;
                default:
                    System.out.println("Необхідно ввести 1-7 варіант\n");
            }
        }
    }

    /**
     * method for reading droids battle from file
     */
    private static void playBattleFromFile(BattleMTM btlMTM) {
        try {
            btlMTM.playBattle("/Users/zz/Desktop/Lab3Data/battle.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Не вдалося прочитати файл.\n");
        }
    }

    /**
     * method for recording the droids battle to file
     */
    private static void saveBattleToFile(BattleMTM btlMTM) {
        try {
            btlMTM.saveBattle("/Users/zz/Desktop/Lab3Data/battle.t1xt1");
        } catch (IOException e) {
            System.out.println("Не вдалося записати файл.\n");
        }
    }

    /**
     * method for forming groups of droids for the upcoming battle
     */
    private static void conductBattleMTM(ArrayList<Droid> droids, BattleMTM btlMTM) {
        Scanner sc = new Scanner(System.in);
        if(droids.size() < 2) {
            System.out.println("Недостатньо створено Дроїдів для проведення поєдинку.\n");
            btlMTM.showGroup(droids);
            return;
        }
        Map<String, Droid> hmDroids = getDroidHashMap(droids);
        btlMTM.initBattle();
        System.out.println("Формуємо першу групу Дроїдів.");
        btlMTM.showGroup(hmDroids);
        while(true) {
            Droid d1 = getDroid(hmDroids, sc);
            btlMTM.addToGroup1(d1);
            if(hmDroids.size() == 1)
                break;
            System.out.println("Закінчити формування групи? 1 - так, 2 - ні.");
            int choice = sc.nextInt();
            if(choice == 1)
                break;
        }

        System.out.println("Формуємо другу групу Дроїдів.");
        btlMTM.showGroup(hmDroids);
        while(true) {
            Droid d2 = getDroid(hmDroids, sc);
            btlMTM.addToGroup2(d2);
            if(hmDroids.size() == 0)
                break;
            System.out.println("Закінчити формування групи? 1 - так, 2 - ні.");
            int choice = sc.nextInt();
            if(choice == 1)
                break;
        }
        btlMTM.Buttle();
    }

    /**
     * method for conducting battle between 2 droids
     */
    private static void conductBattleOTO(ArrayList<Droid> droids, BattleMTM btlMTM) {
        Scanner sc = new Scanner(System.in);
        btlMTM.showGroup(droids);
        if(droids.size() < 2) {
            System.out.println("Недостатньо створено Дроїдів для проведення поєдинку.\n");
            return;
        }
        HashMap<String, Droid> hmDroids = getDroidHashMap(droids);
        btlMTM.initBattle();
        Droid d1 = getDroid(hmDroids, sc);
        btlMTM.addToGroup1(d1);
        Droid d2 = getDroid(hmDroids, sc);
        btlMTM.addToGroup2(d2);
        btlMTM.Buttle();
    }

    /**
     * method for optimising algorithm
     */
    private static HashMap<String, Droid> getDroidHashMap(ArrayList<Droid> droids) {
        HashMap<String, Droid> hmDroids = new HashMap<String, Droid>();
        for(Droid d: droids) {
            hmDroids.put(d.getName(), d);
        }
        return hmDroids;
    }

    /**
     * method for getting droids name which will participate in a battle
     */
    private static Droid getDroid(Map<String, Droid> hmDroids, Scanner sc) {
        Droid dRes = null;
        while(dRes == null) {
            System.out.println("Вкажіть імʼя Дроїда:");
            String name = sc.next();
            if(hmDroids.containsKey(name)) {
                dRes = hmDroids.get(name);
                hmDroids.remove(name);
                break;
            }
            else
                System.out.println("Неправильне імʼя Дроїда.\n");
        }
        return dRes;
    }

    /**
     * method for user to create some droid type with different levels of health and power for an upcoming battle
     */
    private static Droid createDroid() {
        int droidType = 0;
        Scanner sc = new Scanner(System.in);
        while(droidType == 0) {
            System.out.println("Виберіть тип Дроїда.");
            System.out.println("\t1 - захисник");
            System.out.println("\t2 - випадкова сила");
            System.out.println("\t3 - хоробрий");
            System.out.println("\t4 - хитрий");
            System.out.println("\t5 - повернутися у попереднє меню.");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    droidType = choice;
                    break;
                case 5:
                    return null;
                default:
                    System.out.println("Необхідно ввести або 1, або 2, або 3, або 4, або 5 варіант\n");
            }
        }
        System.out.println("Дайте назву Дроїду:");
        String name = sc.next();

        int health = 0;
        while (health < 10 || health > 100) {
            System.out.println("Вкажіть рівень здоровʼя від 10 до 100");
            health = sc.nextInt();
            if(health < 10 || health > 100)
                System.out.println("Введено неправильне значення.\n");
        }
        int damage = 0;
        while (damage < 5 || damage > 20) {
            System.out.println("Вкажіть силу удару від 5 до 20");
            damage = sc.nextInt();
            if(damage < 5 || damage > 20)
                System.out.println("Введено неправильне значення.\n");
        }
        Droid d = null;
        switch (droidType) {
            case 1:
                d = new Defender(name, health, damage, 1.5);
                break;
            case 2:
                d = new RandomPower(name, health, damage);
                break;
            case 3:
                d = new Brave(name, health, damage);
                break;
            case 4:
                d = new Tricky(name, health, damage);
                break;
        }
        System.out.println("Створено Дроїда " + d + "\n");
        return d;
    }

}
