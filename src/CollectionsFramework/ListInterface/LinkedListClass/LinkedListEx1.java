package CollectionsFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;

/*#LinkedList:
    The LinkedList class is an implementation of the LinkedList data structure, which is a linear
    data structure where the elements are not stored in contiguous locations and every element
    is a separate object with a data part and address part. The elements are linked using
    pointers and addresses. Each element is known as a GenericNode. */
public class LinkedListEx1 {
    public static void main(String[] args) {
        // Declaring the LinkedList
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        // Appending new elements at the end of the GenericLinkedLists
        for (int index = 1; index <= 5; index++)
            integerLinkedList.add(index);

        // Printing elements
        System.out.println(integerLinkedList);

        // Remove element at index 3
        integerLinkedList.remove(3);

        // Displaying the List after deletion
        System.out.println(integerLinkedList);

        // Printing elements one by one
        for (Integer EnhancedLinkedList : integerLinkedList)
            System.out.print(EnhancedLinkedList + " ");
    }
}

/*Expected Output:

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5

* */