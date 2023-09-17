package CollectionsFramework;

// LinkedList class Implementation (Collection Framework)
// Scratch Implementation
public class LinkedListEx2 {
    Node head;
    private int size;
    public LinkedListEx2(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    class Node {
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
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = addLastNode;
    }

    // Print node
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }

    // Remove node
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // Add middle of the list
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

    public static void main(String[] args) {
        LinkedListEx2 linkedList = new LinkedListEx2(5);
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.addLast("list");
        linkedList.printList();

        linkedList.addFirst("this");
        linkedList.printList();

        linkedList.addInMiddle(2,"Aronno");
        linkedList.printList();

        System.out.println(linkedList.getSize());


        linkedList.removeFirst();
        linkedList.printList();


        linkedList.removeLast();
        linkedList.printList();
    }
}

/*Expected Output:

is -> a -> list -> null
this -> is -> a -> list -> null
this -> is -> Aronno -> a -> list -> null
11
is -> Aronno -> a -> list -> null
is -> Aronno -> a -> null

* */
