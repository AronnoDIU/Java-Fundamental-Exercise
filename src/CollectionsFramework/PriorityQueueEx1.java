package CollectionsFramework;

import java.util.PriorityQueue;

/*#Queue Interface:
    As the name suggests, a queue interface maintains the FIFO(First In First Out) order similar
    to a real-world queue line. This interface is dedicated to storing all the elements where
    the order of the elements matters. For example, whenever we try to book a ticket, the
    tickets are sold on a first come, first served basis. Therefore, the person whose
    request arrives first into the queue gets the ticket. There are various classes
    like PriorityQueue, ArrayDeque, etc. Since all these subclasses implement the
    queue, we can instantiate a queue object with any of these classes.

    For example:

    Queue <T> pq = new PriorityQueue<> ();
    Queue <T> ad = new ArrayDeque<> ();
    Where T is the type of the object.

The most frequently used implementation of the QUEUE interface is the PriorityQueue.

#Priority Queue:
    A PriorityQueue is used when the objects are supposed to be processed based on priority.
    It is known that a queue follows the First-In-First-Out algorithm, but sometimes the
    elements of the queue are needed to be processed according to the priority and this
    class is used in these cases. The PriorityQueue is based on the priority heap.
    The elements of the priority queue are ordered according to the natural ordering,
    or by a Comparator provided at queue construction time, depending on which constructor is used. */
public class PriorityQueueEx1 {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        // Adding items to the integerPriorityQueue using add()
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(20);
        integerPriorityQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(integerPriorityQueue.peek());

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println(integerPriorityQueue.poll());

        // Printing the top element again
        System.out.println(integerPriorityQueue.peek());
    }
}

/*Expected Output:

10
10
15

* */