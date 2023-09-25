package CollectionsFramework.QueueInterface;

// Queue Implementation
public class QueueImplementation {
    public static void main(String[] args) {
        // create a Queue of capacity 5
        Queue queue = new Queue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("The front element is " + queue.peek());
        queue.remove();
        System.out.println("The front element is " + queue.peek());

        System.out.println("The queue size is " + queue.size());

        queue.remove();
        queue.remove();

        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}

// A class to represent a queue
class Queue {
    private final int[] array;     // array to store queue elements
    private int front;             // front points to the front element in the queue
    private int rear;              // rear points to the last element in the queue
    private final int capacity;    // maximum capacity of the queue
    private int currentSize;             // current size of the queue

    // Constructor to initialize a Queue
    Queue(int size) {
        array = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Utility function to remove the front element
    public void remove() {
        // check for queue underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        int x = array[front];

        System.out.println("Removing " + x);

        front = (front + 1) % capacity;
        currentSize--;

    }

    // Utility function to add an item to the queue
    public void add(int item) {
        // check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        array[rear] = item;
        currentSize++;
    }

    // Utility function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return array[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return currentSize;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }
}

/*Expected Output:

Inserting 1
Inserting 2
Inserting 3
The front element is 1
Removing 1
The front element is 2
The queue size is 2
Removing 2
Removing 3
The queue is empty

* */