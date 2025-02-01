package ExceptionHandling.Ecommerce;

public class Product {
    private final String productId;
    private int stock;

    public Product(String productId, int stock) {
        this.productId = productId;
        this.stock = stock;
    }

    public String getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) throws InsufficientStockException {
        if (quantity > stock) {
            throw new InsufficientStockException("Insufficient stock for product: " + productId);
        }
        stock -= quantity;
    }
}
