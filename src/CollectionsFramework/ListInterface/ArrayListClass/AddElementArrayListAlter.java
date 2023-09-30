package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * Void add(int index, Object element) : This method inserts the specified
 * element E at the specified position in this list. It shifts the element
 * currently at that position (if any) and any subsequent elements to the
 * right (will add one to their indices).
 * <p>
 * Parameters:
 * index : The index at which the specified element is to be inserted.
 * Element : The element to be inserted.
 * <p>
 * Exception:
 * Throws IndexOutOfBoundsException if the specified
 * index is out of range (index  size()).
 */
public class AddElementArrayListAlter {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        ArrayList<Integer> integerArrayList = new ArrayList<>(5);

        // use add() method to add elements in the list
        integerArrayList.add(10);
        integerArrayList.add(22);
        integerArrayList.add(30);
        integerArrayList.add(40);

        // adding element 35 at fourth position
        integerArrayList.add(3, 35);

        // let us print all the elements available in a list
        for (Integer number : integerArrayList) {
            System.out.println("Number = " + number);
        }
    }
}

/*Expected Output:

Number = 10
Number = 22
Number = 30
Number = 35
Number = 40

* */