package ExceptionHandling.Ecommerce;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private final Map<String, Product> products;

    public OrderService() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void placeOrder(String productId, int quantity) throws OrderException {
        Product product = products.get(productId);
        if (product == null) {
            throw new ProductNotFoundException("Product not found: " + productId);
        }
        product.reduceStock(quantity);
    }
}
