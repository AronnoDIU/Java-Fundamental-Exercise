package ObjectOrientedConcept.ECommerce;

import java.math.BigDecimal;

public record Item(String name, BigDecimal price) {

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }
}
