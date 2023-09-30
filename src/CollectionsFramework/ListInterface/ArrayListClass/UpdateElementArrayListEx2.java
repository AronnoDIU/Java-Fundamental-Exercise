package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;

/**
 * Example 2: For IndexOutOfBoundsException
 */
public class UpdateElementArrayListEx2 {
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
            System.out.println("Before operation : "
                    + integerArrayList);

            // Replacing an element at index 7 with 30
            // using method set()
            System.out.println("\nTrying to Replace"
                    + " the element at"
                    + " (index > Capacity) ");
            int i = integerArrayList.set(7, 30);

            // Print the modified integerArrayList
            System.out.println("After operation: " + integerArrayList);

            // Print the Replaced element
            System.out.println("Replaced element: " + i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}

/*Expected Output:

Before operation : [1, 2, 3, 4, 5]

Trying to Replace the element at (index > Capacity)
Exception thrown : java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 5

* */