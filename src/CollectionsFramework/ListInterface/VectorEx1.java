package CollectionsFramework.ListInterface;

import java.util.Vector;

/*#Vector:
    A vector provides us with dynamic arrays in Java. Though, it may be slower than standard arrays
    but can be helpful in programs where lots of manipulation in the array is needed. This is
    identical to ArrayList in terms of implementation. However, the primary difference
    between a vector and an ArrayList is that a Vector is synchronized and an
    ArrayList is non-synchronized. */
public class VectorEx1 {
    public static void main(String[] args) {
        // Declaring the Vector
        Vector<Integer> integerVector = new Vector<>();

        // Appending new elements at the end of the GenericLinkedLists
        for (int index = 1; index <= 5; index++)
            integerVector.add(index);

        // Printing elements
        System.out.println(integerVector);

        // Remove element at index 3
        integerVector.remove(3);

        // Displaying the Vector after deletion
        System.out.println(integerVector);

        // Printing elements one by one
        for (Integer EnhancedVector : integerVector)
            System.out.print(EnhancedVector + " ");
    }
}

/*Expected Output:

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5

* */