package homeWork_14_Stream_API;

import java.util.Objects;

public class Product {
    private int price;
    private String manufactureCategory;
    private int dateOfManufacture;

    public Product(int price, String manufactureCategory, int dateOfManufacture) {
        this.dateOfManufacture= dateOfManufacture;
        this.manufactureCategory = manufactureCategory;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (!Objects.equals(manufactureCategory, product.manufactureCategory))
            return false;
        return Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (manufactureCategory != null ? manufactureCategory.hashCode() : 0);
        result = 31 * result + dateOfManufacture;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                '}';
    }
}
