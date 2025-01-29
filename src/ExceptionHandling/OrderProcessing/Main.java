package ExceptionHandling.OrderProcessing;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Order order1 = new Order("order1", 100.0);
        orderService.addOrder(order1);

        try {
            orderService.processPayment("order1", 100.0);
            System.out.println("Payment processed successfully");
        } catch (OrderProcessingException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderService.processPayment("order1", 50.0);
        } catch (OrderProcessingException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderService.processPayment("order2", 100.0);
        } catch (OrderProcessingException e) {
            System.err.println(e.getMessage());
        }
    }
}
