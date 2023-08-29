package droid;
import random.Rand;
/**
 * class for creating a specific type of droid
 */
public class RandomPower extends Droid{

    private Rand rnd = new Rand();

    public RandomPower(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public String className() {
        return "RandomPower";
    }

    @Override
    public int attackPower() {
        int power = super.attackPower();
        if (this.rnd.randInt(3) == 2) {
            power *= 2;
        }
        return power;
    }

}