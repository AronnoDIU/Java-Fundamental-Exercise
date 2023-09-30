package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * The set() method of java.util.ArrayList class is used to replace the element
 * at the specified position in this list with the specified element.
 * <p>
 * Syntax:
 * Public E set(int index, E element)
 * <p>
 * Parameters: This method takes the following argument as a parameter.
 * <p>
 * Index- index of the element to replace
 * element- element to be stored at the specified position
 * <p>
 * Returns Value: This method returns the element previously at the specified position.
 * <p>
 * Exception: This method throws IndexOutOfBoundsException if the index is not within the size range of the ArrayList.
 * <p>
 * Below are the examples to illustrate the set() method.
 */
public class UpdateElementArrayList {
    public static void main(String[] args) throws Exception {
        try {

            // Creating object of ArrayList<Integer>
            ArrayList<Integer> integerArrayList = new ArrayList<>();

            // Populating arraylist1
            integerArrayList.add(1);
            integerArrayList.add(2);
            integerArrayList.add(3);
            integerArrayList.add(4);
            integerArrayList.add(5);

            // print integerArrayList
            System.out.println("Before operation: "
                    + integerArrayList);

            // Replacing an element at index 3 with 30 using method set()
            int i = integerArrayList.set(3, 30);

            // Print the modified integerArrayList
            System.out.println("After operation: " + integerArrayList);

            // Print the Replaced element
            System.out.println("Replaced element: " + i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}

/*Expected Output:

Before operation: [1, 2, 3, 4, 5]
After operation: [1, 2, 3, 30, 5]
Replaced element: 4

* */