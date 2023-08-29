package battle;

/**
 * class droid parameters
 */
public class Attack {
    private String attacker;
    private String defender;
    private int power;
    private int health;

    public Attack(String attacker, String defender, int power, int health) {
        this.attacker = attacker;
        this.defender = defender;
        this.power = power;
        this.health = health;
    }

    public Attack() {}

    public String getAttacker() {
        return attacker;
    }

    public String getDefender() {
        return defender;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public String attackToString() {
        return this.attacker + "," + this.defender + "," + this.power + "," + this.health;
    }

    public void fillFromSting(String line) {
        String[] arr = line.split(",");
        this.attacker = arr[0];
        this.defender = arr[1];
        this.power = Integer.parseInt(arr[2]);
        this.health = Integer.parseInt(arr[3]);
    }
}