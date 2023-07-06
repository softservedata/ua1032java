package practical;

/* Create class called Product that has the following fields:
• String name, double price and int quantity.
In main() method create four instances of type Product.
• Output the name and quantity of the most expensive item;
• Output the name of the items, which has the biggest quantity. */

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Skirt", 2000, 50);
        Product product2 = new Product("Dress", 3400, 35);
        Product product3 = new Product("Glasses", 1800, 21);
        Product product4 = new Product("Shoes", 5000, 8);
        
        Product mostExp = product1;
        if (product2.getPrice() > mostExp.getPrice()) {
            mostExp = product2;
        }
        if (product3.getPrice() > mostExp.getPrice()) {
            mostExp = product3;
        }
        if (product4.getPrice() > mostExp.getPrice()) {
            mostExp = product4;
        }
        System.out.println("~The most expensive item is " + mostExp.getName() + " and its quantity is " + mostExp.getQuantity() + ".");
        
        Product biggestQuant = product1;
        if (product2.getQuantity() > biggestQuant.getQuantity()) {
            biggestQuant = product2;
        }
        if (product3.getQuantity() > biggestQuant.getQuantity()) {
            biggestQuant = product3;
        }
        if (product4.getQuantity() > biggestQuant.getQuantity()) {
            biggestQuant = product4;
        }
        System.out.println("~The item with the biggest quantity is " + biggestQuant.getName() + ".");
    }
}
