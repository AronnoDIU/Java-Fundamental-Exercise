package CollectionsFramework.QueueInterface;

// Circular Queue from Scratch using Array
public class CircularQueueScratchArray {
    static class CircularQueue {
        static int[] array;
        static int size;
        static int front = -1;
        static int rear = -1;


        CircularQueue(int size) {
            CircularQueue.size = size;
            array = new int[size];
        }


        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            //if it's the 1st element
            if (front == -1) {
                front = 0;
            }


            rear = (rear + 1) % size;
            array[rear] = data;
        }

        // dequeue - O(1) time complexity
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int res = array[front];


            //if only 1 element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }


        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return array[front];
        }
    }

    public static void main(String[] args) {
        new CircularQueue(5);
        CircularQueue.add(1);
        CircularQueue.add(2);
        CircularQueue.add(3);
        CircularQueue.add(4);
        CircularQueue.add(5);
        System.out.println(CircularQueue.remove());
        CircularQueue.add(6);
        System.out.println(CircularQueue.remove());
        CircularQueue.add(7);


        while (!CircularQueue.isEmpty()) {
            System.out.println(CircularQueue.remove());
        }

    }
}

/*Expected Output:

1
2
3
4
5
6
7

* */