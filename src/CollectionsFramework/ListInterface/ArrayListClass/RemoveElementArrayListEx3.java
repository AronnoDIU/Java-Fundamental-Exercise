package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Method 3: Using Iterator.remove() method
 * <p>
 * This may lead to ConcurrentModificationException When iterating over elements,
 * it is recommended to use Iterator.remove() method.
 */
public class RemoveElementArrayListEx3 {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> integerArrayList = new ArrayList<>();

        // Adding elements to our ArrayList using add() method
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(1);
        integerArrayList.add(2);

        // Printing the current ArrayList
        System.out.println(integerArrayList);

        // Remove elements smaller than 10 using Iterator.remove()
        integerArrayList.removeIf(x -> x < 10);

        // Printing the updated ArrayList
        System.out.print(integerArrayList);
    }
}

/*Expected Output:

[10, 20, 30, 1, 2]
[10, 20, 30]

* */