package CollectionsFramework.ListInterface.LinkedListClass;

import java.util.LinkedList;

// peek() : This method retrieves, but does not remove, the head (first element) of this GenericLinkedLists.
public class LinkedListPeek {
    public static void main(String[] args) {
        LinkedList<Object> objectLinkedList = new LinkedList<>();

        objectLinkedList.add("Aronno");
        objectLinkedList.add(4);
        objectLinkedList.add("Aronno");
        objectLinkedList.add("8");

        System.out.println("The initial List is : " + objectLinkedList);

        // peek at the head of the GenericLinkedLists
        System.out.println("Head of the List : " + objectLinkedList.peek());
    }
}

/*Expected Output:

The initial List is : [Aronno, 4, Aronno, 8]
Head of the List : Aronno
* */