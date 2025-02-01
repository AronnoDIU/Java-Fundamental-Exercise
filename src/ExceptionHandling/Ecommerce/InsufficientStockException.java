package ExceptionHandling.Ecommerce;

public class InsufficientStockException extends OrderException {
    public InsufficientStockException(String message) {
        super(message);
    }
}
