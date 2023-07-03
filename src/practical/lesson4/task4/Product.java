package practical.lesson4.task4;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void print(){
        System.out.println("Name: " + name
                          +", Price: " + price
                          +", Quantity: " + quantity);
    }
}
