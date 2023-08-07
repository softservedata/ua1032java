package practicalTwo;

/* To complete the given task, it is required to create a class named Plant
which includes the following fields: int size, Color color (an Enum), Type type (an Enum).
A constructor must be created to initialize these fields.
The toString() method should be overridden to provide a string representation of the Plant object.
Two separate classes named ColorException and TypeException should be created to describe
all possible colors and types of plants respectively. In the main() method, an array of five plants should be created,
and it should be ensured that the exception handling is working correctly for invalid color and type values.
**Add a method that will verify whether the size of the plant is correct and throw an exception
if it is too small or too large.
**Add a method that will verify whether the color and type are both valid and throw an exception
if invalid parameters are entered. */

public class TaskTwo {
    public static void main(String[] args) {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(13, Color.RED, Type.FLOWER);
            plants[1] = new Plant(99, Color.GREEN, Type.TREE);
            plants[2] = new Plant(44, Color.PINK, Type.BUSH);
            plants[3] = new Plant(24, null, Type.TREE);
            plants[4] = new Plant(122, Color.PINK, Type.FLOWER);
            for (Plant plant : plants) {
                System.out.println(plant);
            }
        } catch (ColorException | TypeException | IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}