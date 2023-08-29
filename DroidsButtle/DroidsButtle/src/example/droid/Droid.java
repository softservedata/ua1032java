package droid;

import java.util.List;

import color.ConsoleColors;

/**
 * базовий клас для опису Дроїда
 */
public class Droid {
    private String name = "basic droid";
    private int health = 10;
    private int maxHealth = 10;
    private int damage = 1;
    private String color = ConsoleColors.RED_BOLD_BRIGHT;

    private String className = "Droid";


    /**
     * конструктор
     *
     * @param name назва
     * @param health максимальний рівень здоровʼя
     * @param damage сила удару
     */
    public Droid(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
    }

    public Droid(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }


    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * встановлюємо колір відображення Дроїда на екрані
     *
     * @param color колір
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * метод генерує індикатор рівня здоровʼя Дроїда
     * @return рядок-індикатор
     */
    private String healthSign() {
        if (this.health == this.maxHealth) {
            return "█";
        } else if (this.health < this.maxHealth && (double)this.health >= 6.0 * (double)this.maxHealth / 7.0) {
            return "▇";
        } else if ((double)this.health < 6.0 * (double)this.maxHealth / 7.0 && (double)this.health >= 5.0 * (double)this.maxHealth / 7.0) {
            return "▆";
        } else if ((double)this.health < 5.0 * (double)this.maxHealth / 7.0 && (double)this.health >= 4.0 * (double)this.maxHealth / 7.0) {
            return "▅";
        } else if ((double)this.health < 4.0 * (double)this.maxHealth / 7.0 && (double)this.health >= 3.0 * (double)this.maxHealth / 7.0) {
            return "▄";
        } else if ((double)this.health < 3.0 * (double)this.maxHealth / 7.0 && (double)this.health >= 2.0 * (double)this.maxHealth / 7.0) {
            return "▃";
        } else if ((double)this.health < 2.0 * (double)this.maxHealth / 7.0 && (double)this.health >= 1.0 * (double)this.maxHealth / 7.0) {
            return "▂";
        } else if ((double)this.health < 1.0 * (double)this.maxHealth / 7.0 && (double)this.health > 0) {
            return "▁";
        } else {
            return " ";
        }
    }

    public int getHealth() {
        return health;
    }

    public String className() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String droidName() {
        if (this.isAlive()) {
            return this.color + className() + " " + this.name;
        } else {
            return ConsoleColors.BLACK + className() + " " + this.name;
        }
    }

    @Override
    public String toString() {
        if (this.isAlive()) {
            return droidName() + "┋" + this.healthSign() + this.health + "┋" + ConsoleColors.RESET;
        } else {
            return droidName() + " is dead" + ConsoleColors.RESET;
        }
    }

    /**
     * повертає значення сили атаки Жроїда в залежності від його здоровʼя
     * @return число
     */
    public int attackPower() {
        int power = 1 * this.damage * this.health / this.maxHealth;
        return power < 1 ? 1 : power;
    }

    /**
     * встановлює значення здоровʼя в залежності від сили прийнятого удару
     * @param power сила удару
     */
    public void getKicked(int power) {
        if (this.health < power) {
            this.health = 0;
        } else {
            this.health -= power;
        }

    }


    public Droid chooseOpponent(List<Droid> group) {
        for(Droid d : group) {
            if(!d.isAlive()) continue;
            return d;
        }
        return null;
    }

    /**
     * повертає ознаку того, чи живий Дроїд
     * @return повертає істину або хибність
     */
    public boolean isAlive() {
        return this.health > 0;
    }

    public String droidToString() {
        return className() +  "," + this.name + "," + this.maxHealth;
    }
}