package practice4;

public class Product {

    private String name;
    private double price;
    private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "The most expencive product" +
                "name = '" + name + '\'' +
                ", quantity = " + quantity;
    }

    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.name = "Milk";
        product1.price = 50;
        product1.quantity = 3;

        product2.name = "Chocolate";
        product2.price = 55;
        product2.quantity = 15;

        product3.name = "Pizza";
        product3.price = 120;
        product3.quantity = 8;

        double most_expens = Math.max(Math.max(product1.price, product2.price), product3.price);

        if (most_expens == product1.price) {
            System.out.println(product1);
        } else if (most_expens == product2.price) {
            System.out.println(product2);
        } else {
            System.out.println(product3);
        }

        int largest_quantity = Math.max(Math.max(product1.quantity, product2.quantity), product3.quantity);

        if (largest_quantity == product1.quantity){
            System.out.println("the name of the item which has the biggest quantity : " + product1.name);
        } else if(largest_quantity == product2.quantity){
            System.out.println("the name of the item which has the biggest quantity : " + product2.name);
        } else {
            System.out.println("the name of the item which has the biggest quantity : " + product3.name);
        }
    }






}



