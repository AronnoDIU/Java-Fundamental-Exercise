package JavaCollectionFramework.OnlineStore.Services;

import java.util.List;

import JavaCollectionFramework.OnlineStore.Enteties.Product;

public interface ProductManagementService {
	
	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
