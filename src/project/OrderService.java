package project;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService ( OrderRepository orderRepository ) {
        this.orderRepository = orderRepository;
    }

    public void createOrder ( User user, List<Product> products ) {
        if ( products.isEmpty ( ) ) {
            throw new IllegalArgumentException ( "Неможливо створити порожнє замовлення." );
        }

        double totalAmount = calculateTotalAmount ( products );

        Order order = new Order ( generateOrderId ( ), user, products, totalAmount );
        orderRepository.addOrder ( order );
        user.addToOrderHistory ( order );
    }

    private int generateOrderId() {
        return orderRepository.getNextOrderId();
    }

    public List<Order> getUserOrders ( User user ) {

        return user.getOrderHistory ( );
    }

    private double calculateTotalAmount ( List<Product> products ) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice ( );
        }
        return totalAmount;
    }


}
