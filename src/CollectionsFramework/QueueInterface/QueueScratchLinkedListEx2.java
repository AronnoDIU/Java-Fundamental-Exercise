package CollectionsFramework.QueueInterface;

public class QueueScratchLinkedListEx2 {
    public static void main(String[] args) {
        QueueArrayList.add(1);
        QueueArrayList.add(2);
        QueueArrayList.add(3);
        QueueArrayList.add(4);

        System.out.printf("The front element is %d\n", QueueArrayList.peek());

        QueueArrayList.remove();
        QueueArrayList.remove();
        QueueArrayList.remove();
        QueueArrayList.remove();

        if (QueueArrayList.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}

// A Linked List class Node
class Node {
    int data;       // integer data
    Node next;      // pointer to the next node

    public Node(int data) {
        // set data in the allocated node and return it
        this.data = data;
        this.next = null;
    }
}

class QueueArrayList {
    private static Node rear = null;
    private static Node front = null;
    private static int count = 0;

    // Function to return the size of the queue
    public static int size() {
        return count;
    }

    // Utility function to remove the front element
    public static void remove() {     // delete at the beginning

        if (front == null) {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }

        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);

        // advance front to the next node
        front = front.next;

        // if the list becomes empty
        if (front == null) {
            rear = null;
        }

        // decrease the node's count by 1
        count -= 1;
        // return the removed item
    }

    // Utility function to add an item to the queue
    public static void add(int item) {    // insertion at the end

        // allocate a new node in a heap
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);

        // special case: queue was empty
        if (front == null) {
            // initialize both front and rear
            front = node;
        } else {
            // update rear
            rear.next = node;
        }
        rear = node;

        // increase the node's count by 1
        count += 1;
    }

    // Utility function to return the top element in a queue
    public static int peek() {
        // check for an empty queue
        if (front == null) {
            System.exit(-1);
        }
        return front.data;
    }

    // Utility function to check if the queue is empty or not
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
}

/*Expected Output:

Inserting 1
Inserting 2
Inserting 3
Inserting 4
The front element is 1
Removing 1
Removing 2
Removing 3
Removing 4
The queue is empty

* */