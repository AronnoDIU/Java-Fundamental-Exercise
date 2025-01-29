package ExceptionHandling.OrderProcessing;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private final Map<String, Order> orders;

    public OrderService() {
        orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.orderId(), order);
    }

    public Order getOrder(String orderId) throws OrderNotFoundException {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Order not found: " + orderId);
        }
        return order;
    }

    public void processPayment(String orderId, double paymentAmount) throws OrderProcessingException {
        Order order = getOrder(orderId);
        if (paymentAmount < order.amount()) {
            throw new PaymentFailedException("Payment failed for order: " + orderId);
        }
        System.out.println("Payment processed successfully for order: " + orderId);
    }
}
