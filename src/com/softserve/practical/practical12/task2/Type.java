package com.softserve.practical.practical12.task2;

public enum Type {
    TREES("Trees"),
    HERBS("Herbs"),
    SHRUBS("Shrubs"),
    CLIMBERS("Climbers"),
    CREEPERS("Creepers");

    private String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
