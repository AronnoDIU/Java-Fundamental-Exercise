package CollectionsFramework.ListInterface.LinkedListClass;

// Iterative/Classical Approach
public class LinkedListReverse {
    Node head;
    private int size;

    public LinkedListReverse() {
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

    // Add - last String data
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

    // Reversed Node Iterate Based
    public void reversedIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            // Update the Nodes
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    // Reversed Node Recursive Based
    public Node reversedRecursive(Node head) {
        if (head == null || head.next == null) {    //Corner Point
            return head;
        }

        Node newHead = reversedRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LinkedListReverse linkedListReverse = new LinkedListReverse();

        linkedListReverse.addLast("1");
        linkedListReverse.addLast("2");
        linkedListReverse.addLast("3");
        linkedListReverse.addLast("4");
        linkedListReverse.printList();

        linkedListReverse.reversedIterate();
        linkedListReverse.printList();

        linkedListReverse.addFirst("a");
        linkedListReverse.addFirst("is");
        linkedListReverse.printList();

        linkedListReverse.addLast("Lists");
        linkedListReverse.printList();

        linkedListReverse.addFirst("this");
        linkedListReverse.printList();

        linkedListReverse.addInMiddle(3, "Aronno's");
        linkedListReverse.printList();

        linkedListReverse.removeFirst();
        linkedListReverse.printList();

        linkedListReverse.removeLast();
        linkedListReverse.printList();

        // Reversed Purpose for an Iteration process
        linkedListReverse.addInMiddle(3, "Lists");
        linkedListReverse.printList();

        linkedListReverse.addFirst("this");
        linkedListReverse.printList();

        linkedListReverse.reversedIterate();
        linkedListReverse.printList();

        // Reversed Purpose for a Recursive process
        linkedListReverse.head =
                linkedListReverse.reversedRecursive(linkedListReverse.head);
        linkedListReverse.printList();

        System.out.println(linkedListReverse.getSize());
    }
}

/*Expected Output:

1 -> 2 -> 3 -> 4 -> null
4 -> 3 -> 2 -> 1 -> null
is -> a -> 4 -> 3 -> 2 -> 1 -> null
is -> a -> 4 -> 3 -> 2 -> 1 -> Lists -> null
this -> is -> a -> 4 -> 3 -> 2 -> 1 -> Lists -> null
this -> is -> a -> Aronno's -> 4 -> 3 -> 2 -> 1 -> Lists -> null
is -> a -> Aronno's -> 4 -> 3 -> 2 -> 1 -> Lists -> null
is -> a -> Aronno's -> 4 -> 3 -> 2 -> 1 -> null
is -> a -> Aronno's -> Lists -> 4 -> 3 -> 2 -> 1 -> null
this -> is -> a -> Aronno's -> Lists -> 4 -> 3 -> 2 -> 1 -> null
1 -> 2 -> 3 -> 4 -> Lists -> Aronno's -> a -> is -> this -> null
this -> is -> a -> Aronno's -> Lists -> 4 -> 3 -> 2 -> 1 -> null
11

* */