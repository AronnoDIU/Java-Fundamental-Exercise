package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods:
 * <p>
 * There are 3 ways to remove an element from ArrayList as listed which later on will be revealed as follows:
 * <p>
 * Using remove() method by indexes(default)
 * Using remove() method by values
 * Using remove() method over iterators
 * <p>
 * Note: It is not recommended to use ArrayList.remove() when iterating over elements.
 */
public class RemoveElementArrayList {
    public static void main(String[] args) {
        // Creating an object of List interface with reference to ArrayList class
        List<Integer> al = new ArrayList<>();

        // Adding elements to our ArrayList
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Printing the current ArrayList
        System.out.println(al);

        // This makes a call to remove(int) and
        // removes element 20
        al.remove(1);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al.remove(1);

        // Printing the updated ArrayList
        System.out.println(al);
    }
}

/*Expected Output:

[10, 20, 30, 1, 2]
[10, 1, 2]

* */