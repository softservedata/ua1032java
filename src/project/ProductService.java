package project;

import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService ( List<Product> products ) {
        this.products = products;
    }

    public List<Product> getAllProducts () {
        return products;
    }

    public Product getProductById ( int id ) {
        for (Product product : products) {
            if ( product.getId ( ) == id ) {
                return product;
            }
        }
        return null;
    }


}

