package project;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private Map<Integer, Order> orders = new HashMap<> ( );
    private int nextOrderId = 1;

    public void addOrder ( Order order ) {
        order.setId ( nextOrderId++ );
        orders.put ( order.getId ( ), order );
    }
    public int getNextOrderId() {
        return nextOrderId;
    }

}
