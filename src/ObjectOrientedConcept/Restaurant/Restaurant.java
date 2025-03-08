package ObjectOrientedConcept.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final List<Customer> customers = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();
    private final List<Dish> menu = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Dish> getMenu() {
        return new ArrayList<>(menu);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    @Override
    public String toString() {
        return "Restaurant [customers=" + customers + ", employees=" + employees + ", menu=" + menu + ", orders=" + orders + "]";
    }
}
