package CollectionsFramework;

import java.util.ArrayList;

/*  #ArrayList : provides us with dynamic arrays in Java. Though, it may be slower than standard
    arrays but can be helpful in programs where lots of manipulation in the array is needed.
    The size of an ArrayList is increased automatically if the collection grows or shrinks
    if the objects are removed from the collection. Java ArrayList allows us to randomly
    access the list. ArrayList can not be used for primitive types, like int, char, etc.
    We will need a wrapper class for such cases.*/
public class ArrayListEx2 {
    public static void main(String[] args) {
        // Declaring the ArrayList with initial size n
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Appending new elements at the end of the list
        for (int index = 1; index <= 5; index++)
            integerArrayList.add(index);

        // Printing elements
        System.out.println(integerArrayList);

        // Remove element at index 3
        integerArrayList.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println(integerArrayList);

        // Printing elements one by one
        for (Integer EnhancedArrayList : integerArrayList)
            System.out.print(EnhancedArrayList + " ");
    }
}

/*Expected Output:

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5

* */