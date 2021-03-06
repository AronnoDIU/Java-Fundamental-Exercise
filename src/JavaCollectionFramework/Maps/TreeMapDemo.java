package JavaCollectionFramework.Maps;

import java.util.NavigableMap;
import java.util.TreeMap;

import JavaCollectionFramework.OnlineStore.Enteties.Product;
import JavaCollectionFramework.OnlineStore.Enteties.User;
import JavaCollectionFramework.OnlineStore.Enteties.Implements.DefaultProduct;
import JavaCollectionFramework.OnlineStore.Enteties.Implements.DefaultUser;
import JavaCollectionFramework.OnlineStore.UtilsComparators.CustomProductComparator;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		NavigableMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "one");
		treeMap.put(5, "five");
		treeMap.put(2, "two");
		treeMap.put(4, "four");
		treeMap.put(3, "three");
		
		System.out.println("Get first entry: " + treeMap.firstEntry());
		System.out.println("Lower entry for 3: " + treeMap.lowerEntry(3));
		System.out.println("Floor entry for 3: " + treeMap.floorEntry(3));
		System.out.println("Higher entry for 3: " + treeMap.higherEntry(3));
		System.out.println("Ceiling entry for 3: " + treeMap.ceilingEntry(3));
		
		System.out.println("Sorted treeMap: " + treeMap);
		System.out.println("Descending order: " + treeMap.descendingMap());
		
		NavigableMap<Product, User> productUserMap = 
				new TreeMap<>(new CustomProductComparator());
		productUserMap.put(new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 109.98), new DefaultUser());
		productUserMap.put(new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.98), new DefaultUser());
		
		System.out.println("***** Demo - Keys are sorted according to Comparator: ");
		for (Product product : productUserMap.keySet()) {
			System.out.println(product);
		}
	}
}
