package ExceptionHandling.Ecommerce;

public class ProductNotFoundException extends OrderException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
