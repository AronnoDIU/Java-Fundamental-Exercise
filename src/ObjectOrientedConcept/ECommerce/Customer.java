package ObjectOrientedConcept.ECommerce;

public record Customer(String name, String email) {

    @Override
    public String toString() {
        return "Customer [name=" + name + ", email=" + email + "]";
    }
}
