package CollectionsFramework.ListInterface;

/*Linked List is Linear Data Structures that store values in nodes. As we do know here,
each Node possesses two properties, namely the value of the GenericNode and link to the next
GenericNode if present so. Linked List can not only be of Integer data type
but String, boolean, Float, Character, etc. We can implement such a
“generic” Linked List Data Type that can store values of any data type.

There are 6 primary member functions of a linked GenericLinkedLists: E

    add (data): It adds an element at the end of the linked GenericLinkedLists
    add (position, data): It adds an element to any valid position in the linked GenericLinkedLists
    remove(key): It removes GenericNode that contains key from the linked GenericLinkedLists
    clear() : it clears the entire linked GenericLinkedLists
    empty(): It checks if the linked GenericLinkedLists is empty or not
    length(): It returns the length of the linked GenericLinkedLists

    Note: Time complexity is of order N for adding and removing operations and of order 1 for other operations.*/
public class GenericLinkedList {
    public static void main(String[] args) {
        // Creating a new empty Integer-linked list
        GenericLinkedLists<Integer> integerGenericLinkedLists = new GenericLinkedLists<>();
        System.out.println("Integer LinkedList created as integerGenericLinkedLists");
        // Adding elements to the above List object

        // Element 1 - 100
        integerGenericLinkedLists.addGenericNode(100);
        // Element 2 - 200
        integerGenericLinkedLists.addGenericNode(200);
        // Element 3 - 300
        integerGenericLinkedLists.addGenericNode(300);

        // Display message only
        System.out.println("integerGenericLinkedLists after adding 100,200 and 300");

        // Print and display the above List elements
        System.out.println(integerGenericLinkedLists);

        // Removing 200 from integerGenericLinkedLists
        integerGenericLinkedLists.remove(200);

        // Display message only
        System.out.println("integerGenericLinkedLists after removing 200");

        // Print and display again updated List elements
        System.out.println(integerGenericLinkedLists);

        // Creating a new empty String linked list
        GenericLinkedLists<String> stringGenericLinkedLists = new GenericLinkedLists<>();
        System.out.println("\nString LinkedList created as stringGenericLinkedLists");
        // Adding elements to the above List object

        // Element 1 - hello
        stringGenericLinkedLists.addGenericNode("hello");

        // Element 2 - world
        stringGenericLinkedLists.addGenericNode("world");

        // Display message only
        System.out.println("stringGenericLinkedLists after adding hello and world");

        // Print current elements only
        System.out.println(stringGenericLinkedLists);

        // Now, adding element 3- "Aronno" at position 2
        stringGenericLinkedLists.addGenericNode("Aronno");

        // Display message only
        System.out.println("stringGenericLinkedLists after adding Aronno at position 2");

        // now print the updated List again
        // after inserting an element at second position
        System.out.println(stringGenericLinkedLists);

        // Creating a new empty Float linked list
        GenericLinkedLists<Float> floatGenericLinkedLists = new GenericLinkedLists<>();

        // Display message only
        System.out.println("\nFloat LinkedList created as floatGenericLinkedLists");

        // Adding elements to the above List

        // Element 1 - 20.25
        floatGenericLinkedLists.addGenericNode(20.25f);
        // Element 2 - 50.42
        floatGenericLinkedLists.addGenericNode(50.42f);
        // Element 3 - 30.99
        floatGenericLinkedLists.addGenericNode(30.99f);

        // Display message only
        System.out.println("floatGenericLinkedLists after adding 20.25, 50.42 and 30.99");

        // Print and display List elements
        System.out.println(floatGenericLinkedLists);

        // Display message only
        System.out.println("Clearing floatGenericLinkedLists");

        // Now.clearing this list using clear() method
        floatGenericLinkedLists.clear();

        // Now, print and display the above list again
        System.out.println(floatGenericLinkedLists);
    }
}

// GenericNode class for LinkedList
class GenericNode<T> {
    // Storing value of GenericNode
    T data;
    // Storing address of next GenericNode
    GenericNode<T> next;

    // Parameterized constructor to assign value
    GenericNode(T data) {
        this.data = data;
        this.next = null;
    }
}

// GenericLinkedList class
class GenericLinkedLists<T> {

    // Generic GenericNode instance
    GenericNode<T> head;
    // Storing length of GenericLinkedLists
    private int length = 0;

    GenericLinkedLists() {
        this.head = null;
    }

    //     To add GenericNode at the end of the List
    void addGenericNode(T data) {

        // Creating new GenericNode with given value
        GenericNode<T> temporaryGenericNode = new GenericNode<>(data);

        // Checking if GenericLinkedLists is empty & assigning new value to head GenericNode
        if (this.head == null) {
            head = temporaryGenericNode;
        }

        // If GenericLinkedLists already exists
        else {
            // temporaryGenericNode for traversal
            GenericNode<T> CurrentNode = head;

            // Iterating till the end of the List
            while (CurrentNode.next != null) {
                CurrentNode = CurrentNode.next;
            }

            // Adding new valued GenericNode at the end of the GenericLinkedLists
            CurrentNode.next = temporaryGenericNode;
        }

        // Increasing length after adding new GenericNode
        length++;
    }

    // To remove a GenericNode from GenericLinkedLists
    public void remove() {  // newly added for an infinite key.
        remove(null);
    }

    // To remove a GenericNode from GenericLinkedLists
    void remove(T key) {

/*         Fake GenericNode is used to represent the GenericNode before the current GenericNode
Since in a Singly Linked-List we cannot go backwards from a GenericNode, we use a fake
GenericNode to represent the previous GenericNode. In the case of head GenericNode,
since there is no previous GenericNode, the previous GenericNode is assigned to null.*/

        // Fake GenericNode with null value
        GenericNode<T> prev = new GenericNode<>(null);

        // Dummy GenericNode pointing to head GenericNode
        prev.next = head;

        // Next GenericNode that points ahead of the current GenericNode
        GenericNode<T> next = head.next;

        // Temporary GenericNode for traversal
        GenericNode<T> temp = head;

        // Boolean value that checks whether value to be deleted exists or not
        boolean exists = false;

        // If head GenericNode needs to be deleted
        if (head.data == key) {
            head = head.next;

            // Node to be deleted exists
            exists = true;
        }

        // Iterating over LinkedList
        while (temp.next != null) {

            // We convert value to be compared into Strings and then compare using
            // String1.equals(String2) method & Comparing value of key and current GenericNode
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {

                // If GenericNode to be deleted is found previous GenericNode now points to next
                // GenericNode skipping the current GenericNode
                prev.next = next;
                // GenericNode to be deleted exists
                exists = true;

                // As soon as we find the GenericNode to be deleted, we exit the loop
                break;
            }

            // Previous GenericNode now points to current GenericNode
            prev = temp;

            // Current GenericNode now points to next GenericNode
            temp = temp.next;

            // Next GenericNode points the GenericNode ahead of current GenericNode
            next = temp.next;
        }

        // Comparing the last GenericNode with the given key value
        if (!exists && String.valueOf(temp.data).equals(String.valueOf(key))) {

            // If found, last GenericNode is skipped over
            prev.next = null;

            // Node to be deleted exists
            exists = true;
        }

        // If GenericNode to be deleted exists
        if (exists) {

            // Length of LinkedList reduced
            length--;
        }

        // If GenericNode to be deleted does not exist
        else {
            System.out.println("Given Value is not present in linked GenericLinkedLists");
        }
    }

    // To clear the entire LinkedList
    void clear() {
        // Head now points to null
        head = null;
        // length is 0 again
        length = 0;
    }

    // Returns whether the List is empty or not
    public boolean empty() {
        // Checking if head GenericNode points to null
        return head == null;
    }

    // Returning the length of LinkedList
    public int length() {
        return this.length;
    }

    // To display the LinkedList
    @Override
    public String toString() {

        StringBuilder S = new StringBuilder("{ ");

        GenericNode<T> X = head;

        if (X == null)
            return S + " }";

        while (X.next != null) {
            S.append(X.data).append(" -> ");
            X = X.next;
        }

        S.append(X.data);
        return S + " }";
    }
}

/*Expected Output:

Integer LinkedList created as integerGenericLinkedLists
integerGenericLinkedLists after adding 100,200 and 300
{ 100 -> 200 -> 300 }
integerGenericLinkedLists after removing 200
{ 100 -> 300 }

String LinkedList created as stringGenericLinkedLists
stringGenericLinkedLists after adding hello and world
{ hello -> world }
stringGenericLinkedLists after adding Aronno at position 2
{ hello -> world -> Aronno }

Float LinkedList created as floatGenericLinkedLists
floatGenericLinkedLists after adding 20.25, 50.42 and 30.99
{ 20.25 -> 50.42 -> 30.99 }
Clearing floatGenericLinkedLists
{  }

* */