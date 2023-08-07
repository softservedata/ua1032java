package practicalTwo;

class Plant {
    private int size;
    private Color color;
    private Type type;


    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        setSize(size);
        setColor(color);
        setType(type);
    }

    public void setSize(int size) throws IllegalArgumentException {
        if (size < 1 || size > 100) {
            throw new IllegalArgumentException("The size must be between 1 and 100.");
        }
        this.size = size;
    }

    public void setColor(Color color) throws ColorException {
        if (color == null) {
            throw new ColorException("You entered an invalid color.");
        }
        this.color = color;
    }

    public void setType(Type type) throws TypeException {
        if (type == null) {
            throw new TypeException("You entered an invalid type.");
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
    }
}
    enum Color {
        RED, GREEN, BLUE, PINK
    }

    enum Type {
        FLOWER, BUSH, TREE
    }