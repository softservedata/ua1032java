package com.softserve.practical.practical12.task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws IllegalColorException, IllegalTypeException, IllegalSizeException {
        this.size = validSize(size);
        this.color = validColor(color);
        this.type = validType(type);
    }

    public static Color validColor(String color) throws IllegalColorException {
        return switch (color.toLowerCase()) {
            case "red" -> Color.RED;
            case "green" -> Color.GREEN;
            case "blue" -> Color.BLUE;
            case "yellow" -> Color.YELLOW;
            default -> throw new IllegalColorException("Invalid color!");
        };
    }

    public static Type validType(String type) throws IllegalTypeException {
        return switch (type.toLowerCase()) {
            case "trees" -> Type.TREES;
            case "herbs" -> Type.HERBS;
            case "shrubs" -> Type.SHRUBS;
            case "climbers" -> Type.CLIMBERS;
            case "creepers" -> Type.CREEPERS;
            default -> throw new IllegalTypeException("Invalid type!");
        };
    }

    public static int validSize(int size) throws IllegalSizeException {
        if(size <= 0) throw new IllegalSizeException("Plant is too small!");
        if(size >= 68) throw new IllegalSizeException("Plant is too big!");

        return size;
    }

    @Override
    public String toString() {
        return "Plant { " +
                "size = " + size +
                ", color = " + color.getColorName() +
                ", type = " + type.getTypeName() +
                " }";
    }
}
