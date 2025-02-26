package ObjectOrientedConcept.Shopping;

import java.math.BigDecimal;

public record Product(String name, BigDecimal price) {

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
