package com.softserve.Practical_tasks_Exceptions;
// Enum for valid colors of plants
enum Color {
    RED, BLUE, YELLOW, GREEN
}

// Enum for valid types of plants
enum Type {
    FLOWER, TREE, SHRUB
}

// Custom exception for invalid color
class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

// Custom exception for invalid type
class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

// Plant class with size, color, and type fields
class Plant {
    private int size;
    private Color color;
    private Type type;

    // Constructor to initialize the fields
    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    // Method to verify if the size is correct and throw an exception if it's too small or too large
    public void verifySize() throws IllegalArgumentException {
        if (size < 1 || size > 100) {
            throw new IllegalArgumentException("Invalid size. Size should be between 1 and 100.");
        }
    }

    // Method to verify if the color and type are both valid and throw an exception if invalid parameters are entered
    public void verifyColorAndType() throws ColorException, TypeException {
        if (!isValidColor(color)) {
            throw new ColorException("Invalid color. Valid colors are RED, BLUE, YELLOW, and GREEN.");
        }

        if (!isValidType(type)) {
            throw new TypeException("Invalid type. Valid types are FLOWER, TREE, and SHRUB.");
        }
    }

    // Helper method to check if the color is valid
    private boolean isValidColor(Color color) {
        return color == Color.RED || color == Color.BLUE || color == Color.YELLOW || color == Color.GREEN;
    }

    // Helper method to check if the type is valid
    private boolean isValidType(Type type) {
        return type == Type.FLOWER || type == Type.TREE || type == Type.SHRUB;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Create an array of five plants
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(10, Color.RED, Type.FLOWER);
            plants[1] = new Plant(20, Color.BLUE, Type.TREE);
            plants[2] = new Plant(15, Color.GREEN, Type.SHRUB);
            plants[3] = new Plant(5, Color.YELLOW, Type.FLOWER);
            plants[4] = new Plant(50, Color.BLUE, Type.TREE);

            // Verify size and color/type for each plant
            for (Plant plant : plants) {
                plant.verifySize();
                plant.verifyColorAndType();
                System.out.println(plant);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ColorException | TypeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
