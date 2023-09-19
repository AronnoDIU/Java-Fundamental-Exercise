package CollectionsFramework;

// LinkedList class Implementation (Collection Framework)
// Scratch Implementation
public class LinkedListEx2 {
    Node head;
    private int size;

    public LinkedListEx2() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first
    public void addFirst(String data) {
        Node addFirstNode = new Node(data);

        if (head == null) {
            head = addFirstNode;
            return;
        }
        addFirstNode.next = head;
        head = addFirstNode;
    }

    // Add - last
    public void addLast(String data) {
        Node addLastNode = new Node(data);

        if (head == null) {
            head = addLastNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = addLastNode;  // Assign as a last Node
    }

    // Print GenericNode
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Add middle of the GenericLinkedLists
    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }

        size++;

        Node addInMiddleNode = new Node(data);

        if (head == null || index == 0) {
            addInMiddleNode.next = head;
            head = addInMiddleNode;
            return;
        }

        Node currentNode = head;

        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currentNode.next;
                currentNode.next = addInMiddleNode;
                addInMiddleNode.next = nextNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    // Remove First Node
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }

    // Remove Last Node
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        /*Size doesn't appear in below Because, if the existing Node is single,
        then the statement will return & Size doesn't change */
        size--;

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;      // if head.next = null then, lastNode = null
        while (lastNode.next != null) { // so, lastNode.next == null.next which is error!
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LinkedListEx2 linkedList = new LinkedListEx2();
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.printList();

        linkedList.addLast("GenericLinkedLists");
        linkedList.printList();

        linkedList.addFirst("this");
        linkedList.printList();

        linkedList.addInMiddle(3, "Aronno's");
        linkedList.printList();

        linkedList.removeFirst();
        linkedList.printList();

        linkedList.removeLast();
        linkedList.printList();

        System.out.println(linkedList.getSize());
    }
}

/*Expected Output:

is -> a -> null
is -> a -> GenericLinkedLists -> null
this -> is -> a -> GenericLinkedLists -> null
this -> is -> a -> Aronno's -> GenericLinkedLists -> null
is -> a -> Aronno's -> GenericLinkedLists -> null
is -> a -> Aronno's -> null
4

* */
