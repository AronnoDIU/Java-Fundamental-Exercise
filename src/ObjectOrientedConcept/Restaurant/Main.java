package ObjectOrientedConcept.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");

        Employee employee1 = new Employee("John", "E001", "Chef");
        Employee employee2 = new Employee("Jane", "E002", "Waiter");

        Dish dish1 = new Dish("Pasta", 12.50);
        Dish dish2 = new Dish("Pizza", 15.00);

        restaurant.addCustomer(customer1);
        restaurant.addCustomer(customer2);
        restaurant.addEmployee(employee1);
        restaurant.addEmployee(employee2);
        restaurant.addDish(dish1);
        restaurant.addDish(dish2);

        Order order1 = new Order("O001", customer1);
        order1.addDish(dish1);
        order1.addDish(dish2);

        Order order2 = new Order("O002", customer2);
        order2.addDish(dish2);

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        System.out.println(restaurant);
    }
}
