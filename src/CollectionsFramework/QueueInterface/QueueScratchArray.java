package CollectionsFramework.QueueInterface;

public class QueueScratchArray {
    static int[] arr;
    static int size;
    static int rear;


    // Can't prevent instantiation of class!
    QueueScratchArray(int size) {
        QueueScratchArray.size = size;
        arr = new int[size];
        rear = -1;
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static boolean isFull() {
        return rear == size - 1;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = data;
    }

    //O(n)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return arr[0];
    }

    public static void main(String[] args) {
        new QueueScratchArray(5);
        add(1);
        add(2);
        add(3);

        while (!isEmpty()) {
            System.out.println(peek());
            remove(); // after remove: Everyone should leave
        }

        System.out.println(); //There is no Queue left to remove
        remove(); // removed from index[0] front!

        while (!isEmpty()) { // empty queue
            System.out.println(peek());
            remove();
        }
    }
}

/*Expected Output:

1
2
3

empty queue

* */