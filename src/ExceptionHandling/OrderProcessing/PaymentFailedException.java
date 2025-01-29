package ExceptionHandling.OrderProcessing;

public class PaymentFailedException extends OrderProcessingException {
    public PaymentFailedException(String message) {
        super(message);
    }
}
