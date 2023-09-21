package CollectionsFramework.QueueInterface;

import java.util.ArrayDeque;

/*#Deque Interface: (Double Ended Queue)
    This is a very slight variation of the queue data structure. Deque, also known as a double-ended
    queue, is a data structure where we can add and remove elements from both ends of the queue.
    This interface extends the queue interface. The class which implements this interface is
    ArrayDeque. Since ArrayDeque class implements the Deque interface, we can instantiate a
    deque object with this class.

    For example,
    Deque<T> ad = new ArrayDeque<> ();
    Where T is the type of the object.

The class which implements the DEQUE interface is ArrayDeque.

#ArrayDeque:
    ArrayDeque class which is implemented in the collection framework provides us with a way
    to apply a resizable array. This is a special kind of array that grows and allows users
    to add or remove an element from both sides of the queue. Array dequeue have no
    capacity restrictions, and they grow as necessary to support usage. */
public class ArrayDequeEx1 {
    public static void main(String[] args) {
        // Initializing an deque
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>(10);

        // add() method to insert
        integerArrayDeque.add(10);
        integerArrayDeque.add(20);
        integerArrayDeque.add(30);
        integerArrayDeque.add(40);
        integerArrayDeque.add(50);

        System.out.println(integerArrayDeque);

        // clear() method
        integerArrayDeque.clear();

        // addFirst() method to insert the
        // elements at the head
        integerArrayDeque.addFirst(564);
        integerArrayDeque.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        integerArrayDeque.addLast(24);
        integerArrayDeque.addLast(14);

        System.out.println(integerArrayDeque);
    }
}

/*Expected Output:

[10, 20, 30, 40, 50]
[291, 564, 24, 14]

* */