package example.battle;

import color.ConsoleColors;
import droid.Droid;
import random.Rand;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * class for conducting a battle between droid groups (many to many)
 */
public class BattleMTM {
    private List<Droid> gr1;
    private List<Droid> gr2;
    private Rand rnd = new Rand();
    private List<battle.Attack> attackSequence;


    public BattleMTM() {
        gr1 = new ArrayList<Droid>();
        gr2 = new ArrayList<Droid>();
        attackSequence = new ArrayList<battle.Attack>();
    }

    public void initBattle() {
        gr1.clear();
        gr2.clear();
        attackSequence.clear();
    }

    public void addToGroup1(Droid d) {
        gr1.add(d);
    }

    public void addToGroup2(Droid d) {
        gr2.add(d);
    }

    private void simpleAttack(Droid d1, Droid d2) {
        if (!d1.isAlive()) return;

        int kickPower = d1.attackPower();
        d2.getKicked(kickPower);
        attackSequence.add(new battle.Attack(d1.getName(), d2.getName(), kickPower, d2.getHealth()));

        showAttack(d1, d2, kickPower);
    }

    /**
     * method for conducting an attack
     */
    private static void showAttack(Droid d1, Droid d2, int kickPower) {
        System.out.println("\t\t" + d1.droidName()
                + ConsoleColors.YELLOW + " " + kickPower + " ╳ "
                + d2);
    }

    /**
     * method for conducting an attack
     */
    private void groupAttack(List<Droid>firstGr, ArrayList<Droid>secondGr) {
        for(Droid d : firstGr) {
            if(!d.isAlive()) continue;

            Droid op = d.chooseOpponent(secondGr);
            if(op != null) {
                simpleAttack(d, op);
                simpleAttack(op, d);
            }
        }
    }

    /**
     * method for showing group of droids from some side
     */
    public void showGroup(List<Droid> droids) {
        for(Droid d : droids) {
            if(d.isAlive()) {
                System.out.print(ConsoleColors.YELLOW + " * " + d);
            }
        }
        System.out.println(ConsoleColors.RESET);
    }
    /**
     * method for showing group of droids from some side
     */
    public void showGroup(Map<String, Droid> hmDroids) {

        for(Droid d : hmDroids.values()) {
            if(d.isAlive()) {
                System.out.print(ConsoleColors.YELLOW + " * " + d);
            }
        }
        System.out.println(ConsoleColors.RESET);
    }

    private void fillTourGroup(List<Droid> tourGr, List<Droid> gr, String color) {
        tourGr.clear();

        for(Droid d : gr) {
            if(d.isAlive()) {
                d.setColor(color);
                tourGr.add(d);
            }
        }
    }

    /**
     * method for showing droids state
     */
    private void showState() {
        System.out.println(ConsoleColors.YELLOW + "=".repeat(80));
        showGroup(gr1);
        System.out.println(ConsoleColors.YELLOW + " ".repeat(5) + "-".repeat(70) + " ".repeat(5));
        showGroup(gr2);
        System.out.println(ConsoleColors.YELLOW + "=".repeat(80));
    }

    /**
     * method for showing droids state
     */
    private void showState(HashMap<String, Droid> hm1, HashMap<String, Droid> hm2) {
        System.out.println(ConsoleColors.YELLOW + "=".repeat(80));
        showGroup(hm1);
        System.out.println(ConsoleColors.YELLOW + " ".repeat(5) + "-".repeat(70) + " ".repeat(5));
        showGroup(hm2);
        System.out.println(ConsoleColors.YELLOW + "=".repeat(80));
    }

    /**
     * method for providing a battle
     */
    public void Buttle() {
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "Buttle has started");

        ArrayList<Droid>firstGr = new ArrayList<Droid>();
        ArrayList<Droid>secondGr = new ArrayList<Droid>();

        fillTourGroup(firstGr, gr1, ConsoleColors.RED);
        fillTourGroup(secondGr, gr2, ConsoleColors.BLUE);

        showState();

        while(firstGr.size()!=0 && secondGr.size() != 0) {

            System.out.println();

            groupAttack(firstGr, secondGr);
            groupAttack(secondGr, firstGr);

            fillTourGroup(firstGr, gr1, ConsoleColors.RED);
            fillTourGroup(secondGr, gr2, ConsoleColors.BLUE);
        }

        System.out.println(ConsoleColors.YELLOW + "Buttle is over");
        showState();
        System.out.println(ConsoleColors.RESET);

    }

    /**
     * method for saving a conducted battle to file
     */
    public void saveBattle(String fileName) throws IOException {
        if(attackSequence.size() == 0) {
            System.out.println("Битва поки що не відбулася.");
            return;
        }
        FileWriter writer = null;
        writer = new FileWriter(fileName);
        writer.write("GROUP1\n");
        for(Droid d: gr1) {
            writer.write(d.droidToString());
            writer.write("\n");
        }
        writer.write("GROUP2\n");
        for(Droid d: gr2) {
            writer.write(d.droidToString());
            writer.write("\n");
        }
        writer.write("ATTACKSEQUENCE\n");
        for(battle.Attack a: attackSequence) {
            writer.write(a.attackToString());
            writer.write("\n");
        }
        writer.write("END\n");
        writer.close();
        System.out.println("Файл збережено.\n");
    }

    /**
     * method for providing a battle
     */
    public void playBattle(String fileName) throws FileNotFoundException {
        HashMap<String, Droid> hmDroids1 = new HashMap<String, Droid>();
        HashMap<String, Droid> hmDroids2 = new HashMap<String, Droid>();
        readBattleFromFile(fileName, hmDroids1, hmDroids2);


        System.out.println("Відтворення поєдинку:\n");
        System.out.println(ConsoleColors.YELLOW + "Buttle has started");

        for(Droid d : hmDroids1.values()) {
            d.setColor(ConsoleColors.RED);
        }

        for(Droid d : hmDroids2.values()) {
            d.setColor(ConsoleColors.BLUE);
        }

        showState(hmDroids1, hmDroids2);

        for(battle.Attack a: attackSequence) {
            Droid d1, d2;
            if(hmDroids1.containsKey(a.getAttacker())) {
                d1 = hmDroids1.get(a.getAttacker());
                d2 = hmDroids2.get(a.getDefender());
            }
            else {
                d1 = hmDroids2.get(a.getAttacker());
                d2 = hmDroids1.get(a.getDefender());
            }
            d2.setHealth(a.getHealth());
            showAttack(d1, d2, a.getPower());
        }

        System.out.println(ConsoleColors.YELLOW + "Buttle is over");
        showState(hmDroids1, hmDroids2);
        System.out.println(ConsoleColors.RESET);
    }

    /**
     * method for reading a conducted battle from string
     */
    private void readBattleFromFile(String fileName, HashMap<String, Droid> hmDroids1, HashMap<String, Droid> hmDroids2) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner sc = new Scanner(fis);
        int mode = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.equals("GROUP1")) {
                mode = 1;
                continue;
            }
            if(line.equals("GROUP2")) {
                mode = 2;
                continue;
            }
            if(line.equals("ATTACKSEQUENCE")) {
                mode = 3;
                continue;
            }
            if(line.equals("END")) {
                break;
            }
            if(mode == 1) {
                Droid d = getDroidFromString(line);
                hmDroids1.put(d.getName(), d);
            }
            if(mode == 2) {
                Droid d = getDroidFromString(line);
                hmDroids2.put(d.getName(), d);
            }
            if(mode == 3) {
                battle.Attack a = new battle.Attack();
                a.fillFromSting(line);
                attackSequence.add(a);
            }
        }
        sc.close();
    }

    private Droid getDroidFromString(String line) {
        String[] arr = line.split(",");
        Droid d = new Droid(arr[1], Integer.parseInt(arr[2]));
        d.setClassName(arr[0]);
        return d;
    }
}