package JavaCollectionFramework.OnlineStore.Services;

import java.util.List;

import JavaCollectionFramework.OnlineStore.Enteties.Order;

public interface OrderManagementService {
	
	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();


}
