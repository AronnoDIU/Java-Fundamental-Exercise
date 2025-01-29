package ExceptionHandling.OrderProcessing;

public class OrderNotFoundException extends OrderProcessingException {
    public OrderNotFoundException(String message) {
        super(message);
    }
}
