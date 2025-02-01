package ExceptionHandling.Ecommerce;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Product product1 = new Product("prod1", 10);
        orderService.addProduct(product1);

        try {
            orderService.placeOrder("prod1", 5);
            System.out.println("Order placed successfully");
        } catch (OrderException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderService.placeOrder("prod1", 10);
        } catch (OrderException e) {
            System.err.println(e.getMessage());
        }

        try {
            orderService.placeOrder("prod2", 1);
        } catch (OrderException e) {
            System.err.println(e.getMessage());
        }
    }
}
