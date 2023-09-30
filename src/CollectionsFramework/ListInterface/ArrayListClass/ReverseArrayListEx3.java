package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 2. By using Collections class: Collections is a class in java.util package
 * which contains various static methods for searching, sorting, reversing,
 * finding max, min….etc. We can make use of the In-built Collections.reverse()
 * method for reversing an arraylist. It takes a list as an input parameter
 * and returns the reversed list.
 */
public class ReverseArrayListEx3 {
    public static void main(String[] args) {
        // Declaring arraylist without any initial size
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Appending elements at the end of the list
        integerArrayList.add(new Integer(9));
        integerArrayList.add(new Integer(145));
        integerArrayList.add(new Integer(878));
        integerArrayList.add(new Integer(343));
        integerArrayList.add(new Integer(5));
        System.out.print("Elements before reversing: ");
        printElements(integerArrayList);

        // Collections.reverse method takes a list as a
        // parameter and reverses the passed parameter
        //(no new array list is required)
        Collections.reverse(integerArrayList);
        System.out.print("\nElements after reversing: ");
        printElements(integerArrayList);
    }

    // Iterate through all the elements and print
    public static void printElements(ArrayList<Integer> integerArrayList) {
        for (Integer EnhancedList : integerArrayList) {
            System.out.print(EnhancedList + " ");
        }
    }
}

/*Expected Output:

Elements before reversing: 9 145 878 343 5
Elements after reversing: 5 343 878 145 9

* */