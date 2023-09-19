package CollectionsFramework;

import java.util.LinkedList;

// peek() : This method retrieves, but does not remove, the head (first element) of this list.
public class LinkedListPeek {
    public static void main(String[] args) {
        LinkedList<Object> objectLinkedList = new LinkedList<>();

        objectLinkedList.add("Aronno");
        objectLinkedList.add(4);
        objectLinkedList.add("Aronno");
        objectLinkedList.add("8");

        System.out.println("The initial list is : " + objectLinkedList);

        // peek at the head of the list
        System.out.println("Head of the list : " + objectLinkedList.peek());
    }
}

/*Expected Output:

The initial list is : [Aronno, 4, Aronno, 8]
Head of the list : Aronno
* */