package droid;
/**
 * class for creating a specific type of droid
 */
public class Defender extends Droid{

    private double defence = 1;
    public Defender(String name, int health, int damage, double defence) {
        super(name, health, damage);
        this.defence = defence;
    }
    @Override
    public String className() {
        return "Defencer";
    }

    @Override
    public void getKicked(int power) {
        int kickPower = (int) (Math.round(power/defence));
        super.getKicked(kickPower);
    }
}